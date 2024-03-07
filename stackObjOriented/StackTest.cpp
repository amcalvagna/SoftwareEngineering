#include "Stack.hpp"

void foo (void) {
	Stack s1 (1), s2 (10);
	T item;

	if (!s1.is_full ())
	s1.push (473);
	if (!s2.is_full ())
	s2.push (2112);
	if (!s2.is_empty ())
		s2.pop (item);
	// Access violation caught at compile-time!
	//s2.top_= 10;
	// Termination is handled automatically.
    s2.print();
}

int main(){ 
    foo();
    return 0;
}