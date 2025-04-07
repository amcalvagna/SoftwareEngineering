#include <stdlib.h>
#include <stdio.h>
#include "Stack.h"

/* Hidden within this file. */
static int top_ , size_ ;
static T *stack_ ;

int create (int size) {
	top_= 0; size_ = size;
	stack_ = malloc (size * sizeof (T));
	return stack_ == 0 ? -1 : 0;
}
void destroy (void) { free ((void *) stack_ ); }
void push (T item) { stack_ [top_ ++] = item; }
void pop (T *item) { *item = stack_ [--top_ ]; }
void top (T *item) { *item = stack_ [top_ -1]; }
int is_empty (void) { return top_ == 0; }
int is_full (void) { return top_ == size_ ; }
void print(){ for(int i=0; i < size_; i++) printf("%d ",stack_[i]); }