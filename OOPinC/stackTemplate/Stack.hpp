// typedef int T;
#include <iostream>

template <class T>
class Stack {
	public:
		Stack (size_t size);
		~Stack (void);
		void push (const T &item);
		void pop (T &item);
		int is_empty (void) const;
		int is_full (void) const;
		void print(void);
		//…
	private:
		size_t top_, size_;
		T *stack_;
};

template <class T> 
Stack<T>::Stack (size_t size) {top_=0, size_=size, stack_=new T[size]; }

template <class T> 
Stack<T>::~Stack (void) { 
	delete [] this->stack_;
}
template <class T> 
void Stack<T>::push (const T &item) {
	this->stack_[this->top_++] = item;
}
template <class T> 
void Stack<T>::pop (T &item) {
	item = this->stack_[--this->top_];
}

template <class T> 
int Stack<T>::is_empty (void) const { return this->top_ == 0; }

template <class T> 
int Stack<T>::is_full (void) const { return this->top_ == this->size_ ; }

template <class T> 
void Stack<T>::print(void) { for(int i=0; i < size_; i++) std::cout<< stack_[i]<<" "; std::cout<<"\n";}
