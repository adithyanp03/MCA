#include<stdio.h>
#include<stdlib.h>

#define MAX 100

// Structure to represent a node in the graph
struct Node {
    int data;
    struct Node* next;
};

// Structure to represent the graph
struct Graph {
    int vertices;
    struct Node* adjacencyList[MAX];
};

// Function to initialize a graph with given vertices
struct Graph* initializeGraph(int vertices) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->vertices = vertices;

    for (int i = 0; i < vertices; i++) {
        graph->adjacencyList[i] = NULL;
    }

    return graph;
}

// Function to add an edge to the graph
void addEdge(struct Graph* graph, int source, int destination) {
    // Add edge from source to destination
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = destination;
    newNode->next = graph->adjacencyList[source];
    graph->adjacencyList[source] = newNode;

    // Add edge from destination to source (since it's an undirected graph)
}

// Depth-First Search
void DFS(struct Graph* graph, int vertex, int visited[]) {
    if (visited[vertex]) {
        return;
    }

    printf("%d ", vertex);
    visited[vertex] = 1;

    struct Node* temp = graph->adjacencyList[vertex];
    while (temp != NULL) {
        int adjVertex = temp->data;
        DFS(graph, adjVertex, visited);
        temp = temp->next;
    }
}

// Breadth-First Search
void BFS(struct Graph* graph, int start) {
    int visited[MAX] = {0};
    int queue[MAX];
    int front = -1, rear = -1;

    // Enqueue the start vertex
    queue[++rear] = start;
    visited[start] = 1;

    while (front != rear) {
        int currentVertex = queue[++front];
        printf("%d ", currentVertex);

        struct Node* temp = graph->adjacencyList[currentVertex];
        while (temp != NULL) {
            int adjVertex = temp->data;
            if (!visited[adjVertex]) {
                queue[++rear] = adjVertex;
                visited[adjVertex] = 1;
            }
            temp = temp->next;
        }
    }
}
void topologicalSortDFS(struct Graph* graph, int vertex, int visited[], struct Node** stack) {
    visited[vertex] = 1;

    struct Node* temp = graph->adjacencyList[vertex];
    while (temp != NULL) {
        int adjVertex = temp->data;
        if (!visited[adjVertex]) {
            topologicalSortDFS(graph, adjVertex, visited, stack);
        }
        temp = temp->next;
    }

    // Push the current vertex to the stack after visiting all its adjacent vertices
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = vertex;
    newNode->next = *stack;
    *stack = newNode;
}

// Function to perform topological sort using DFS
void topologicalSort(struct Graph* graph) {
    int visited[MAX] = {0};
    struct Node* stack = NULL;

    for (int i = 0; i < graph->vertices; i++) {
        if (!visited[i]) {
            topologicalSortDFS(graph, i, visited, &stack);
        }
    }

    // Store topological order in an array
    int topOrder[MAX];
    int index = 0;
    while (stack != NULL) {
        topOrder[index++] = stack->data;
        struct Node* temp = stack;
        stack = stack->next;
        free(temp);
    }

    // Print the topological order
    printf("Topological Sort: ");
    for (int i = 0; i<=index-1; i++) {
        printf("%d ", topOrder[i]);
    }
    
    printf("\n");
}




int main() {
    int choice, vertices, edges, startVertex;

    printf("Enter the number of vertices: ");
    scanf("%d", &vertices);

    struct Graph* graph = initializeGraph(vertices);

    do {
        printf("\nMenu:\n");
        printf("1. Add Edge\n");
        printf("2. DFS\n");
        printf("3. BFS\n");
        printf("4. Topological Sort\n");

        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the edges in order: ");
                scanf("%d %d", &startVertex, &edges);
                if(startVertex<=vertices && edges<=vertices){
                addEdge(graph, startVertex, edges);
                }else{
                printf("msg");
                }
                break;
            case 2:
                printf("Enter the starting vertex for DFS: ");
                scanf("%d", &startVertex);
                printf("DFS starting from vertex %d: ", startVertex);
                int visitedDFS[MAX] = {0};
                DFS(graph, startVertex, visitedDFS);
                printf("\n");
                break;
            case 3:
                printf("Enter the starting vertex for BFS: ");
                scanf("%d", &startVertex);
                printf("BFS starting from vertex %d: ", startVertex);
                BFS(graph, startVertex);
                printf("\n");
                break;
            case 4:topologicalSort(graph);
            break;
            

            case 5:
                printf("Exiting program. Goodbye!\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 5);

    return 0;
}
	

