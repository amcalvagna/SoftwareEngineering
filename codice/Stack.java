//import java.lang.reflect.Array;
//import java.lang.reflect.ParameterizedType;
//import java.util.ArrayList;

class Stack<T> {
	
    private int top, size;
	private T[] stack;
    private String type;

	public Stack (int size) {
        this.top = 0; 
        this.size = size; 
        this.stack= (T[]) new Object[size];
        int [] i = new int[10];
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

    public static void main(String []args){
        Stack s = new Stack<Integer>(10);
        Stack<Integer> s1 = new Stack<Integer>(10);
        Stack<String> s2 = new Stack<String>(10);
        s1.setType("Stack<Integer>");    
        s2.setType("Stack<String>");
        
        try{
            //s.pop();
            s.push(10);            
            System.out.println(s.pop());

            s1.push(20);
            System.out.println(s1.pop());
            
            s2.push("ciao");
            System.out.println(s2.pop());
            System.out.println(s2.pop());
            s2.pop();
        }catch(StackOverflowException e){ 
            System.out.println(e.getMessage());
        }catch(StackUnderflowException e){
            System.out.println(e.getMessage());
        }

    }
		//…
       
    void setType(String type){this.type = type;}
    String getType(){return this.type;}
	
};
