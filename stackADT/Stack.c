#include <stdlib.h>
#include "Stack.h"

int Stack_create (Stack *s, size_t size) {
	s->top_ = 0; s->size_ = size;
	s->stack_ = malloc (size * sizeof (T));
	return s->stack_ == 0 ? -1 : 0;
}
void Stack_destroy (Stack *s) {
	free ((void *) s->stack_ );
	s->top_ = 0; s->size_ = 0; s->stack_ = 0;
}

void Stack_push (Stack *s, T item) {
	s->stack_ [s->top_++] = item;
}
void Stack_pop (Stack *s, T *item) {
	*item = s->stack_ [--s->top_ ];
}
int Stack_is_empty (Stack *s) {
	return s->top_ == 0;
}

void Stack_print(Stack *s) {
	for(int i=0; i < s->size_; i++) printf("%d ",s->stack_[i]); 
	printf("\n"); 
}