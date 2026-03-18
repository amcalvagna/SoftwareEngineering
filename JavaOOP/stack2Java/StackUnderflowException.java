package stack2Java;

public class StackUnderflowException extends Exception{
    private Stack<?> stack; 
    StackUnderflowException(Stack<?> s) { this.stack=s;}
    public String getMessage(){ 
        return "an underflow exception has occurred in "+this.stack.getType();  
    }
    
}
