#include <stdio.h>

typedef int T;
/* const int MAX STACK = 5; */
#define MAX_STACK 5
T stack[MAX_STACK];
int top = 0;

T item = 1234;

void print(){
	for(int i=0; i < MAX_STACK; i++) printf("%d ",stack[i]);
}

int main(){
	stack[top++] = item; // push
	print();
	item = stack[--top]; // pop
	
	//top = 5;
	//stack[0]=1; 
	//--top;

	return 0;
}

