#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node* left;
    int data;
    struct node* right;
};

struct node *get_node() {
    struct node *p;
    p = (struct node *)malloc(sizeof(struct node));
    return p;
}

void create_node(struct node **);
void insert_node(struct node *, struct node *);
struct node *delete_node(struct node *, int x);
void inorder(struct node *);
void preorder(struct node *);
void postorder(struct node *);

int main() {
    struct node *root;
    root = NULL;
    while (1) {
        int ch;
        printf("\n\n 1.To Create Root node \n 2.To Insert Data \n 3.To Delete Data \n 4.Inorder Traversal \n 5.Preorder Traversal");
        printf("\n 6.Postorder Traversal \n 7.To Exit\n");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                create_node(&root);
                break;
            case 2: {
                struct node *temp;
                temp = get_node();
                printf("\n Enter the data to be inserted: ");
                scanf("%d", &temp->data);
                temp->left = NULL;
                temp->right = NULL;
                if (root == NULL)
                    root = temp;
                else
                    insert_node(root, temp);
                break;
            }
            case 3: {
                int x;
                if (root == NULL)
                    printf("\n Binary Tree is Empty...");
                else {
                    printf("\n Enter the data to be deleted: ");
                    scanf("%d", &x);
                    printf("\n Before Deletion : ");
                    inorder(root);
                    root = delete_node(root, x);
                    printf("\n After Deletion : ");
                    inorder(root);
                }
                break;
            }
            case 4:
                inorder(root);
                break;
            case 5:
                preorder(root);
                break;
            case 6:
                postorder(root);
                break;
            case 7:
                exit(0);
            default:
                printf("\n Wrong value entered...");
        }
    }
}

// Creating a node //
void create_node(struct node **q) {
    struct node *p;
    p = get_node();
    printf("\n Enter value of 1st node:\t");
    scanf("%d", &p->data);
    p->left = NULL;
    p->right = NULL;
    *q = p;
}

// Inserting node //
void insert_node(struct node *q, struct node *temp) {
    if (temp->data <= q->data) {
        if (q->left != NULL)
            insert_node(q->left, temp);
        else
            q->left = temp;
    } else {
        if (q->right != NULL)
            insert_node(q->right, temp);
        else
            q->right = temp;
    }
}

// Inorder Traversal //
void inorder(struct node *q) {
    if (q != NULL) {
        inorder(q->left);
        printf(" =>%d", q->data);
        inorder(q->right);
    }
}

// Preorder Traversal //
void preorder(struct node *q) {
    if (q != NULL) {
        printf(" =>%d", q->data);
        preorder(q->left);
        preorder(q->right);
    }
}

// Postorder Traversal //
void postorder(struct node *q) {
    if (q != NULL) {
        postorder(q->left);
        postorder(q->right);
        printf(" =>%d", q->data);
    }
}

// Deleting a node //
struct node *delete_node(struct node *q, int x) {
    if (q == NULL) {
        return q;
    } else if (x < q->data) {
        q->left = delete_node(q->left, x);
    } else if (x > q->data) {
        q->right = delete_node(q->right, x);
    } else {
        if (q->left == NULL && q->right == NULL) {
            free(q);
            q = NULL;
        } else if (q->left == NULL) {
            struct node *temp = q;
            q = q->right;
            free(temp);
        } else if (q->right == NULL) {
            struct node *temp = q;
            q = q->left;
            free(temp);
        } else {
            struct node *temp = q->right;
            while (temp->left != NULL) {
                temp = temp->left;
            }
            q->data = temp->data;
            q->right = delete_node(q->right, temp->data);
        }
    }
    return q;
}