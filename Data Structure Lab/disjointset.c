#include <stdio.h>
#include <stdlib.h>

#define MAX_ELEMENTS 100

int parent[MAX_ELEMENTS];
int rank[MAX_ELEMENTS];
int n = 0; // Number of elements

void initialize(int x) {
    parent[x] = x;
    rank[x] = 0;
}

int find(int x) {
    if (parent[x] != x) {
        parent[x] = find(parent[x]);
    }
    return parent[x];
}

void unionSets(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);

    if (rootX != rootY) {
        // Union by rank
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}

void displaySets(int elements[]) {
    printf("\nSets:\n");
    for (int i = 0; i < n; i++) {
        int representative = find(i);
        printf("Element %d belongs to Set %d (Representative: %d)\n", elements[i], representative, elements[representative]);
    }
}

void makeSet(int x) {
    if (n < MAX_ELEMENTS) {
        initialize(n);
        n++;
    } else {
        printf("Maximum number of elements reached.\n");
    }
}

int main() {
    int elements[MAX_ELEMENTS];

    while (1) {
        printf("\n1.Make set\n2.Union\n3.Find Set Representative\n4.Display\n5.Exit\n");

        int choice, x, y;
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("\nEnter the element to add: ");
                scanf("%d", &x);
                elements[n] = x;
                makeSet(x);
                break;
            case 2:
                printf("\nEnter first index: ");
                scanf("%d", &x);
                printf("Enter second index: ");
                scanf("%d", &y);

                if (x < 0 || x >= n || y < 0 || y >= n) {
                    printf("\nInvalid input.\n");
                } else {
                    unionSets(x, y);
                }
                break;
            case 3:
                printf("\nEnter the element index: ");
                scanf("%d", &x);

                if (x < 0 || x >= n) {
                    printf("\nInvalid input. Element index out of bounds.\n");
                } else {
                    int representative = find(x);
                    printf("\nThe representative of element %d is %d\n", elements[x], elements[representative]);
                }
                break;
            case 4:
                displaySets(elements);
                break;
            case 5:
                exit(0);
            default:
                printf("\nWrong choice\n");
                break;
        }
    }

    return 0;
}
