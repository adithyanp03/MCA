
#include<stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node *next;
  struct node *prev;
};
struct node *head;
void insertlast(int item){
  struct node *ptr = (struct node *)malloc(sizeof(struct node));
  struct node *temp;
  ptr->data=item;
  if(head==NULL){
    ptr->next=NULL;
    ptr->prev=NULL;
    head=ptr;
  }
  else{
    temp=head;
    while(temp->next!=NULL)
      temp=temp->next;
    temp->next=ptr;
    ptr->prev=temp;
    ptr->next=NULL;
  }
  printf("Node inverted\n");
}

void search(){
  struct node *ptr;
  int item,i=0,flag;
  ptr=head;
  if(ptr==NULL)
    printf("Empty list");
  else{
    printf("Enter the item which you want to search:\n");
    scanf("%d",&item);
    while(ptr!=NULL){
      if(ptr->data==item){
        printf("Item found at %d position\n",i+1);
        flag=0;break;
      }
      else
        flag=1;
      i++;
      ptr=ptr->next;
    }
    if(flag!=0)
      printf("Item not found\n");
  }
}

void delete(int value){
  if(head==NULL){
    return;
  }
  struct node *temp=head;
  struct node *ptr=NULL;
  if(temp!=NULL && temp->data==value){
    head=temp->next;
    free(temp);
    return;
  }
  while(temp!=NULL && temp->data!=value){
    ptr = temp;
    temp=temp->next;
  }
  ptr->next=temp->next;
  free(temp);
}

void delpos(int pos){
  struct node *temp;
  struct node *ptr;
  int i;
  temp=head;
  for(i=1;i<pos && temp!=NULL;i++)
  {
    temp=temp->next;
  }
  if(temp==NULL)
  {
  printf("invalid position");
  return;
  }
  if(temp->prev!=NULL){
    temp->prev->next=temp->next;
  }
  else{
    head = temp->next;
  }
  if(temp->next!=NULL)
    temp->next->prev=temp->prev;
  else
    printf("The position you entered is invalid\n");
  free(temp);
}

void inpos(int item,int pos){
   int i;
   struct node *ptr,*temp;
   ptr=(struct node *)malloc(sizeof(struct node));
   temp=head;
   i=1;
   while(i<pos- -1 && temp !=NULL){
     temp=temp->next;
     i++;
   }
   if (pos==1){
     if(head==NULL){
       ptr->next=NULL;
       ptr->prev = NULL;
       ptr->data = item;
       head = ptr;
     }
     else{
       ptr->data=item;
       ptr->prev=NULL;
       ptr->next=head;
       head->prev!=ptr;
       head = ptr;
     }
   }
   else if(temp!=NULL)
   {
     ptr->data=item;
     ptr->next=temp->next;
     ptr->prev=temp;
     if(temp->next!=NULL)
     {
       temp->next->prev=ptr;
     }
     temp->next=ptr;
   }
   else
     printf("The position you entered is invalid \n");
}

void display(){
  struct node *ptr;
  if(head==NULL){
    printf("The Doubly Linked  list is empty\n");
  }    
  else{
    ptr = head;
    while(ptr->next!=NULL)
    {
      printf("%d ->",ptr->data);
      ptr=ptr->next;
    }
    printf("%d\n",ptr->data);
  }
}
 
void main(){
  int y=1,ch,item, value,pos;
  while(y==1)
  {
    printf("Menu:\n");
    printf("1. Insert last\n");  
    printf("2. Search\n");    
    printf("3. Delete an element\n");
    printf("4. Delete at 'pos'\n");
    printf("5. Insert at 'pos'\n");
    printf("6. Display\n");
    printf("Enter your choice:");
    scanf("%d",&ch);
    switch(ch){
      case 1:  printf("Enter the item:\n");
        scanf("%d",&item);
        insertlast(item);
        break;
      case 2: search();
        break;
      case 3: printf("Enter the element\n");
        scanf("%d",&value);
        delete(value);
        break;
      case 4: printf("Enter the position:\n");
        scanf("%d",&pos);
        delpos(pos);
        break;
      case 5: printf("Enter the item:\n");
        scanf("%d",&item);
        printf("Enter the position:\n");
        scanf("%d",&pos);
        inpos(item,pos);
        break;
      case 6: display();
        break;
      default: printf("Invalid Choice\n");
        break;    
    }
    printf("Do you want to continue enter 1:\n");
    scanf("%d",&y);
  }
}

	 
