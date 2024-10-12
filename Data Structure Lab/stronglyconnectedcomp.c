#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_VERTICES 100

struct Node {
    int value;
    struct Node* next;
}

struct Graph {
    int numVertices;
    struct Node** adjacencyList;
    bool* visited;
};

struct Stack {
    int* items;
    int top;
};

struct Node* createNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = value;
    newNode->next = NULL;
    return newNode;
}

struct Stack* createStack(int capacity) {
    struct Stack* stack = (struct Stack*)malloc(sizeof(struct Stack));
    stack->top = -1;
    stack->items = (int*)malloc(sizeof(int) * capacity);
    return stack;
}

void push(struct Stack* stack, int item) {
    if (stack->top < MAX_VERTICES - 1) {
        stack->items[++stack->top] = item;
    } else {
        printf("Stack overflow!\n");
    }
}


int pop(struct Stack* stack) {
    return stack->items[stack->top--];
}

struct Graph* createGraph(int numVertices) {
    struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
    graph->numVertices = numVertices;
    graph->adjacencyList = (struct Node**)malloc(sizeof(struct Node*) * numVertices);
    graph->visited = (bool*)malloc(sizeof(bool) * numVertices);

    for (int i = 0; i < numVertices; ++i) {
        graph->adjacencyList[i] = NULL;
        graph->visited[i] = false;
    }

    return graph;
}

void addEdge(struct Graph* graph, int src, int dest) {
    struct Node* newNode = createNode(dest);
    newNode->next = graph->adjacencyList[src];
    graph->adjacencyList[src] = newNode;
}




struct Graph* getTranspose(struct Graph* graph) {
    struct Graph* transposedGraph = createGraph(graph->numVertices);

    for (int v = 0; v < graph->numVertices; v++) {
        struct Node* temp = graph->adjacencyList[v];
        while (temp != NULL) {
            addEdge(transposedGraph, temp->value, v);
            temp = temp->next;
        }
    }

    return transposedGraph;
}



void DFS(struct Graph* graph, int vertex, struct Stack* stack, bool forOrder) {
    graph->visited[vertex] = true;

    struct Node* temp = graph->adjacencyList[vertex];
    while (temp != NULL) {
        if (!graph->visited[temp->value]) {
            DFS(graph, temp->value, stack, forOrder);
        }
        temp = temp->next;
    }

    if (forOrder) {
        push(stack, vertex);  // Push for ordering in transposed graph DFS
    } else {
        printf("%d ", vertex);  // Print for displaying SCC
    }
}

void printSCC(struct Graph* graph) {
    struct Stack* stack = createStack(graph->numVertices);

    for (int v = 0; v < graph->numVertices; v++) {
        if (!graph->visited[v]) {
            DFS(graph, v, stack, true);
        }
    }

    struct Graph* transposedGraph = getTranspose(graph);

    for (int i = 0; i < transposedGraph->numVertices; i++) {
        transposedGraph->visited[i] = false;  // Corrected line
    }

    while (stack->top != -1) {
        int vertex = pop(stack);
        if (!transposedGraph->visited[vertex]) {
            printf("Strongly Connected Component: ");
            DFS(transposedGraph, vertex, NULL, false);
            printf("\n");
        }
    }

    free(stack->items);
    free(stack);

    // Free the memory for transposedGraph
    for (int i = 0; i < transposedGraph->numVertices; ++i) {
        struct Node* current = transposedGraph->adjacencyList[i];
        while (current) {
            struct Node* next = current->next;
            free(current);
            current = next;
        }
    }

    free(transposedGraph->adjacencyList);
    free(transposedGraph->visited);
    free(transposedGraph);
}


int main() {
    int numVertices, choice;

    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    struct Graph* graph = createGraph(numVertices);

    do {
        printf("\nMenu:\n");
        printf("1. Add Edge\n");
        printf("2. Find Strongly Connected Components\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: {
                int src, dest;
                printf("Enter source and destination vertices for the edge: ");
                scanf("%d %d", &src, &dest);
                addEdge(graph, src, dest);
                printf("Edge added successfully.\n");
                break;
            }
            case 2:
                                printSCC(graph);
                break;
            case 3:
                printf("Exiting the program.\n");
                break;
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }

    } while (choice != 3);

    return 0;
}

