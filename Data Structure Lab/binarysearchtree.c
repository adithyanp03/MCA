#include <stdio.h>
#include <stdlib.h>

struct TreeNode {
    int value;
    struct TreeNode* leftChild;
    struct TreeNode* rightChild;
};

struct TreeNode* createNewNode(int value) {
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    newNode->value = value;
    newNode->leftChild = newNode->rightChild = NULL;
    return newNode;
}

struct TreeNode* insertNode(struct TreeNode* root, int value) {
    if (root == NULL) {
        return createNewNode(value);
    }
    if (value < root->value) {
        root->leftChild = insertNode(root->leftChild, value);
    } else if (value > root->value) {
        root->rightChild = insertNode(root->rightChild, value);
    }
    return root;
}

struct TreeNode* findMinimumNode(struct TreeNode* node) {
    while (node->leftChild != NULL) {
        node = node->leftChild;
    }
    return node;
}

struct TreeNode* deleteNode(struct TreeNode* root, int value) {
    if (root == NULL) {
        return root;
    }
    if (value < root->value) {
        root->leftChild = deleteNode(root->leftChild, value);
    } else if (value > root->value) {
        root->rightChild = deleteNode(root->rightChild, value);
    } else {
        if (root->leftChild == NULL) {
            struct TreeNode* tempNode = root->rightChild;
            free(root);
            return tempNode;
        } else if (root->rightChild == NULL) {
            struct TreeNode* tempNode = root->leftChild;
            free(root);
            return tempNode;
        }
        struct TreeNode* tempNode = findMinimumNode(root->rightChild);
       
        root->value = tempNode->value;
       
        root->rightChild = deleteNode(root->rightChild, tempNode->value);
    }
    return root;
}

int searchNode(struct TreeNode* root, int value, int depth) {
    if (root == NULL) {
        return -1;
    }
    if (value < root->value) {
        return searchNode(root->leftChild, value, depth + 1);
    } else if (value > root->value) {
        return searchNode(root->rightChild, value, depth + 1);
    } else {
        return depth;
    }
}

void inorderTraversal(struct TreeNode* root) {
    if (root != NULL) {
        inorderTraversal(root->leftChild);
        printf("%d ", root->value);
        inorderTraversal(root->rightChild);
    }
}

int main() {
    struct TreeNode* root = NULL;
    int choice, value, depth;

    while (1) {
        printf("1. Insert\n2. Delete\n3. Search\n4. Display\n5. Exit\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                root = insertNode(root, value);
                break;

            case 2:
                printf("Enter value to delete: ");
                scanf("%d", &value);
                root = deleteNode(root, value);
                break;

            case 3:
                printf("Enter value to search: ");
                scanf("%d", &value);
                depth = searchNode(root, value, 0);
                if (depth != -1) {
                    printf("%d found at depth %d in the BST.\n", value, depth);
                } else {
                    printf("%d not found in the BST.\n", value);
                }
                break;

            case 4:
                //printf("Inorder traversal of the BST: ");
                inorderTraversal(root);
                printf("\n");
                break;

            case 5:
                exit(0);

            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
    return 0;
}
