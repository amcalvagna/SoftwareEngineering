#include <stdio.h>

/* Type of Stack element. */
typedef int T;

/* Type definition for Stack ADT. */
typedef struct {
	size_t top_, size_;
	T *stack_ ;
} Stack;

/* Stack interface. */
int Stack_create (Stack *s, size_t size);
void Stack_destroy (Stack *s);
void Stack_push (Stack *s, T item);
void Stack_pop (Stack *, T *item);
int Stack_is_empty (Stack *);
int Stack_is_full (Stack *);
void Stack_print (Stack *);
