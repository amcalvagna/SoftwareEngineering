/* Type of Stack element. */
typedef int T;

/* Stack interface. */
int create (int size);
void destroy (void);
void push (T new_item);
void pop (T *old_top);
void top (T *cur_top);
int is_empty (void);
int is_full (void);
void print(void);