#include <stddef.h>
typedef int T;

class Stack {
	public:
		Stack (size_t size);
		~Stack (void);
		void push (const T &item);
		void pop (T &item);
		int is_empty (void) const;
		int is_full (void) const;
		void print(void);
	// …
	private:
		size_t top_, size_;
		T *stack_;
};