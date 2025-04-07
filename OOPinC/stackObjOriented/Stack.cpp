#include <cstdio>
#include "Stack.hpp"

Stack::Stack (size_t size) {top_=0, size_=size, stack_=new T[size]; }

Stack::~Stack (void) { delete [] this->stack_ ;}

void Stack::push (const T &item) {this->stack_ [this->top_ ++] = item;}
void Stack::pop (T &item) { item = this->stack_ [--this->top_ ]; }
int Stack::is_empty (void) const { return this->top_ == 0; }
int Stack::is_full (void) const { return this->top_ == this->size_ ; }

void Stack::print(void) { for(int i=0; i < size_; i++) printf("%d ",stack_[i]); printf("\n");}