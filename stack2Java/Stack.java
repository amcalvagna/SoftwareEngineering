package stack2Java;
import java.lang.reflect.Array;  //generic array object "meta-type"

class Stack<T> {	
    private int top, size;
	private T[] stack;
    private String type;

   public Stack(Class<T> type, int size){
        this.top = 0; 
        this.size = size; 
        this.stack = (T[]) Array.newInstance(type, size); // class type == T  should match
    }
	
    public void push (T item) throws StackOverflowException{
        if (this.is_full()) throw new StackOverflowException(this); 
        this.stack[this.top++] = item;
    }
	public T pop ()throws StackUnderflowException{
        if (this.is_empty()) throw new StackUnderflowException(this); 
        return 	this.stack[--this.top];

    }
	public boolean is_empty (){ return this.top == 0;}
	public boolean is_full (){ return this.top == this.size;}
		//…
       
    void setType(String type){this.type = type;}
    String getType(){return this.type;}
	
};
