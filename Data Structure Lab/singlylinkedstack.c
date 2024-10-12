#include <stdio.h>
#include <stdlib.h>
typedef struct node{
    int data;
    struct node*next;
}nodes;
void push(int);
void pop();
void display();
void search();
nodes *top=NULL;
void main()
{
    int y=1,ch,item;
    while(y==1)
    {
        printf("\n 1.push\n 2.pop\n 3.display \n 4.search\n");
        printf("Enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: printf("Enter the item:\n");
                    scanf("%d",&item);
                    push(item);
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            case 4: search();
                    break;
            default:
                    printf("\n invalid choice");
                    break;

        }
        printf("\n Do you want to continue enter 1 :");
        scanf("%d",&y);

    }
}
void push(int item)
{
    nodes *newnode;
    newnode =(nodes*)malloc(sizeof (nodes));
    if(top==NULL)
    {
        newnode->next=NULL;
        top=newnode;
    }
    else
    {
        newnode->next=top;
        top=newnode;
    }
    newnode->data=item;
}
void pop()
{
    nodes* newnode = top;
    int item;
    if(top==NULL)
        printf("\n underflow");
    else
    {
        item=top->data;
        top=top->next;
        printf("\n popped item =%d",item);
    }
}
void display()
{
    nodes *newnode=top;
    if(newnode==NULL)
        printf("underflow");
    else
    {
        printf("\n items of the stack:");
        while(newnode!=NULL)
        {
            printf("%d",newnode->data);
            newnode=newnode->next;
        }
    }
}
void search ()
{
    nodes *newnode=top;
    int item ,f;
    printf("Enter the item to be searched !");
    scanf("%d",&item);
    if(top==NULL)
        printf("Value not found");
    else
    {
        while (newnode!=NULL)
        {
            if(newnode->data==item)
            {
                printf("item is found");
                f=0;

            }
            newnode=newnode->next;

        }
    }
    if(f!=0)
        printf("item not found \n");
}


