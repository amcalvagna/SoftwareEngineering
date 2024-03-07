#include <cstdio>
#include "Stack.hpp"

void foo (void) {
	Stack s1 (1), s2 (100);
	try {
		T item;
		s1.push (473);
		s1.push (42); // Exception, push'd full stack!
		s2.pop (item); // Exception, pop'd empty stack!
		//s2.top_ = 10; // Access violation caught!
	} catch (Stack::Underflow) {
		// Handle underflow…
		printf("handling underflow...\n");
	} catch (Stack::Overflow) {
		// Handle overflow…
		printf("handling overflow...\n");

	}
	// Termination is handled automatically.
}
int main(){ 
    foo();
    return 0;
}