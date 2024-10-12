#include <stdio.h>
#include <stdlib.h>

// Structure to represent a node in a binomial heap
struct Node {
    int key;
    int degree;
    struct Node* parent;
    struct Node* child;
    struct Node* sibling;
};

// Function to create a new node with a given key
struct Node* createNode(int key) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->key = key;
    newNode->degree = 0;
    newNode->parent = NULL;
    newNode->child = NULL;
    newNode->sibling = NULL;
    return newNode;
}

// Function to merge two binomial heaps
struct Node* mergeBinomialHeaps(struct Node* h1, struct Node* h2) {
    if (h1 == NULL)
        return h2;
    if (h2 == NULL)
        return h1;

    struct Node* res = NULL;
    struct Node* temp = NULL;
    struct Node* h1Next = h1->sibling;
    struct Node* h2Next = h2->sibling;

    while (h1 != NULL && h2 != NULL) {
        if (h1->degree <= h2->degree) {
            temp = h1;
            h1 = h1Next;
            h1Next = (h1Next != NULL) ? h1Next->sibling : NULL;
        } else {
            temp = h2;
            h2 = h2Next;
            h2Next = (h2Next != NULL) ? h2Next->sibling : NULL;
        }

        if (res == NULL) {
            res = temp;
        } else {
            res->sibling = temp;
            res = res->sibling;
        }
    }

    if (h1 != NULL)
        res->sibling = h1;
    else
        res->sibling = h2;

    return res;
}

// Function to insert a key into a binomial heap
struct Node* binomialHeapInsert(struct Node* head, int key) {
    struct Node* temp = createNode(key);
    return mergeBinomialHeaps(head, temp);
}

// Function to find the minimum key in a binomial heap
struct Node* findMinNode(struct Node* head) {
    struct Node* minNode = NULL;
    struct Node* current = head;

    while (current != NULL) {
        if (minNode == NULL || current->key < minNode->key) {
            minNode = current;
        }
        current = current->sibling;
    }

    return minNode;
}

// Function to extract the minimum node from a binomial heap
struct Node* extractMin(struct Node* head) {
    if (head == NULL)
        return NULL;

    struct Node* minNode = findMinNode(head);
    struct Node* prev = NULL;
    struct Node* current = head;

    while (current != NULL) {
        if (current == minNode) {
            if (prev == NULL) {
                head = current->sibling;
            } else {
                prev->sibling = current->sibling;
            }
            break;
        }
        prev = current;
        current = current->sibling;
    }

    struct Node* child = minNode->child;
    struct Node* childPrev = NULL;

    while (child != NULL) {
        childPrev = child;
        child = child->sibling;
        childPrev->sibling = NULL;
        head = mergeBinomialHeaps(head, childPrev);
    }

    free(minNode);
    return head;
}

// Function to decrease the key of a node in a binomial heap
struct Node* decreaseKey(struct Node* head, struct Node* target, int newKey) {
    if (head == NULL || target == NULL || newKey >= target->key)
        return head;

    target->key = newKey;
    struct Node* current = target;
    struct Node* parent = current->parent;

    while (parent != NULL && current->key < parent->key) {
        int temp = current->key;
        current->key = parent->key;
        parent->key = temp;

        current = parent;
        parent = current->parent;
    }

    return head;
}

// Function to display the keys of nodes in a binomial heap
void displayBinomialHeap(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->key);
        displayBinomialHeap(head->child);
        head = head->sibling;
    }
}

// Function to free the memory allocated for a binomial heap
void freeBinomialHeap(struct Node* head) {
    if (head == NULL)
        return;

    freeBinomialHeap(head->child);
    freeBinomialHeap(head->sibling);
    free(head);
}

// Example usage
int main() {
    struct Node* binomialHeap = NULL;
    int choice, key, newKey;

    while (1) {
        printf("\n Binomial Heap Menu\n");
        printf("1. Insert\n");
        printf("2. Decrease Key\n");
        printf("3. Extract Min\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter key to insert: ");
                scanf("%d", &key);
                binomialHeap = binomialHeapInsert(binomialHeap, key);
                printf("Key %d inserted.\n", key);
                break;

            case 2:
                // Assuming there's at least one node in the heap
                if (binomialHeap != NULL) {
                    printf("Enter new key: ");
                    scanf("%d", &newKey);
                    binomialHeap = decreaseKey(binomialHeap, binomialHeap->sibling, newKey);
                    printf("Decrease Key operation performed.\n");
                } else {
                    printf("Heap is empty. Cannot perform Decrease Key operation.\n");
                }
                break;

            case 3:
                // Assuming there's at least one node in the heap
                if (binomialHeap != NULL) {
                    binomialHeap = extractMin(binomialHeap);
                    printf("Min element extracted.\n");
                } else {
                    printf("Heap is empty. Cannot perform Extract Min operation.\n");
                }
                break;

            case 4:
                printf("Binomial Heap: ");
                displayBinomialHeap(binomialHeap);
                printf("\n");
                break;

            case 5:
                freeBinomialHeap(binomialHeap);
                printf("Exiting the program.\n");
                exit(0);

            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    }

    return 0;
}
