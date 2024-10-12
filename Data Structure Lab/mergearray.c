#include<stdio.h>
void merge_array(int arr1[],int size1,int arr2[],int size2,int newarr[])
{
	int i=0,j=0,k=0;
	while(i<size1 && j<size2){
		if(arr1[i]<arr2[j]){
		newarr[k++]=arr1[i++];
	}
    else
       newarr[k++]=arr2[j++];
      }
  while(i<size1){
      newarr[k++]=arr1[i++];
      }
   while(j<size2){
      newarr[k++]=arr2[j++];
   }
 }
int main(){
  int size1,size2,i;
	printf("enter the size of first sorted array:");
	scanf("%d",&size1);
int arr1[size1];
	printf("enter the element of first array:");
	for(i=0;i<size1;i++){
		scanf("%d",&arr1[i]);
}
	printf("enter the size of second sorted arrray:");
	scanf("%d",&size2);
	int arr2[size2];
	int newarr[size1+size2];
	printf("enter the element of second array:");
	for(i=0;i<size2;i++){
	scanf("%d",&arr2[i]);
}
merge_array(arr1,size1,arr2,size2,newarr);
printf("merged array:");
for(i=0;i<size1+size2;i++){
printf("%d\t",newarr[i]);
}
return 0;
}
