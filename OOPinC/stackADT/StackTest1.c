#include "Stack.h"

void foo (void){
	Stack s1, s2, s3; /* Multiple stacks! */
	T item;
	
	//Stack_create(&s1,10);
	Stack_push (&s1, 1);
	Stack_print(&s1); 

	Stack_create(&s2,5);
	//Stack_push (&s2, 54);
	Stack_pop(&s2, &item);
	Stack_print(&s2); 

	Stack_create(&s3,5);
	Stack_push(&s3,1234);
	Stack_print(&s3); 

	Stack_destroy(&s1);

	//s1.top_ = s2.stack_[0]; /* Violate abstraction */
	//s2.size_= s3.top_; /* Violate abstraction */

}

int main(){ 
	printf("test started...\n");
    foo();
	printf("test ended...\n");
    
    return 0;
}

