#include <stdio.h>
#include <stdlib.h>
#define MAX 50

void display(int arr[], int size);
void union1(int abit[], int bbit[], int result[], int usize);
void intersect(int abit[], int bbit[], int result[], int usize);
void differ(int abit[], int bbit[], int result[], int usize);

int main () {
	int uset[MAX], aset[MAX], bset[MAX], abit[MAX], bbit[MAX], result[MAX];
	int usize, asize, bsize;
	int i, j, ch;

	printf("Enter the size of universal set: ");
	scanf("%d", &usize);
	printf("Enter elements: ");
	for(i = 0; i < usize; i++) {
		scanf("%d", &uset[i]);
	}
	
	printf("Enter size of set 1: ");
	scanf("%d", &asize);
	printf("Enter elements: ");
	for(i = 0; i < asize; i++) {
		scanf("%d", &aset[i]);
	}
	
	printf("Enter size of set 2: ");
	scanf("%d", &bsize);
	printf("Enter elements: ");
	for(i = 0; i < bsize; i++) {
		scanf("%d", &bset[i]);
	}
	
	for(i = 0; i < usize; i++) {
		for(j = 0; j < asize; j++){
			if(uset[i] == aset[j]) {
				abit[i] = 1;
				break;
			}else abit[i] = 0;
		}
	}
	
	for(i = 0; i < usize; i++) {
		for(j = 0; j < bsize; j++){
			if(uset[i] == bset[j]) {
				bbit[i] = 1;
				break;
			}else bbit[i] = 0;
		}
	}
	
	while(1) {
		printf("\n1. Display\n2. Bit vector of sets\n3. Union\n4. Intersection\n5. Difference\n6. EXIT\nEnter your choice: ");
		scanf("%d", &ch);
		
		switch (ch) {
			case 1:
					printf("Universal set: ");
					display(uset, usize);
					printf("Set 1: ");
					display(aset, asize);
					printf("Set 2: ");
					display(bset, bsize);
					break;
			case 2:
					printf("Bitvector of set 1: ");
					display(abit, usize);
					printf("Bitvector of set 2: ");
					display(bbit, usize);
					break;
			case 3:
					printf("Union: ");
					union1(abit, bbit, result, usize);
					display(result, usize);
					break;
			case 4:
					printf("Intersection: ");
					intersect(abit, bbit, result, usize);
					display(result, usize);
					break;
			case 5:
					printf("Difference: ");
					differ(abit, bbit, result, usize);
					display(result, usize);
					break;
			case 6:
					exit(0);
			default:
					printf("Invalid choice. Try again\n");
		}
	}
}

void display(int arr[], int size) {
	printf("{ ");
		for(int i = 0; i < size; i++) {
			printf("%d", arr[i]);
			if(i < size-1) printf(", ");
		}
	printf(" }\n");
}

void union1(int abit[], int bbit[], int result[], int usize) {
	for(int i = 0; i < usize; i++) {
		result[i] = abit[i] | bbit[i];
	}
}

void intersect(int abit[], int bbit[], int result[], int usize) {
	for(int i = 0; i < usize; i++) {
		result[i] = abit[i] & bbit[i];
	}
}

void differ(int abit[], int bbit[], int result[], int usize) {
	for(int i = 0; i < usize; i++) {
		result[i] = abit[i] & ~bbit[i];
	}
}
