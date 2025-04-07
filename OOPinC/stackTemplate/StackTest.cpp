#include <string>
#include "Stack.hpp"

void foo (void) {
	Stack<int> s1 (1), s2 (10);
	Stack<std::string> s3 (3); 
	int item;
	std::string name="Angela"; 

	if (!s1.is_full ())
	s1.push (473);
	if (!s2.is_full ())
	s2.push (2112);
	if (!s2.is_empty ())
		s2.pop (item);

	s3.push(name);
	s1.print();
	s2.print();
	s3.print();	

	// Access violation caught at compile-time!
	//s2.top_= 10;
	// Termination is handled automatically.
    //s2.print();
}

int main(){ 
    foo();
    return 0;
}