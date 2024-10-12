#include<stdio.h>
#define MAX 6
int queue[MAX];
int front=-1,rear=-1;
void insert(int element){
	if((front==-1)&&(rear==-1))
	{
		front=0;
		rear=0;
		queue[rear]=element;
	}
	else if((rear+1)%MAX==front)
		printf("Overflow");

	else
	{
		rear=(rear+1)%MAX;
		queue[rear]=element;
	}
}
int delete()
{
	if((front==-1)&&(rear==-1))
		printf("Queue is underflow");
	else if(front==rear){
			printf("The deleted item=%d",queue[front]);
			front=-1;
			rear=-1;
	}
	else{
			printf("Deleted Item=%d",queue[front]);
			front=(front+1)%MAX;
		}
}
int search(int value){
int f=0;
	if((front==-1)&&(rear==-1)){
	printf("Underflow");
	}
	for(int i=front;i<=rear;i=(i+1)%MAX){
	if(queue[i]==value){
		printf("%d is found at %d position",value,i);
		f++;
		}
}
if(f==0){
		printf("Value not found");}
		return 0;
		}

void display(){
	int i=front;
	if(front==-1&&rear==-1)
		printf("Queue is empty");

else{

printf("Elements are:");
while(i<=rear)
{
printf("%d\t",queue[i]);
i=(i+1)%MAX;
}
}
}

int main()
{
int y=1,ch,value,element;
while(y==1)
{
printf("\n1.Insert \n2.Delete\n3.Search\n4.Display");
printf("\nEnter your choice");
scanf("%d",&ch);
switch(ch){
case 1:printf("Enter the element:");
      scanf("%d",&element);
      insert(element);
      break;
case 2:delete();
     break;
case 3:printf("Enter the valur to be searched:");
      scanf("%d",&value);
      search(value);
      break;
case 4:display();
      break;
default:printf("Invalid choice");
break;
}
printf("\n do you want to continue enter 1:");
scanf("%d",&y);
}
}

