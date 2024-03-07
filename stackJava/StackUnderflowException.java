package stackJava;

public class StackUnderflowException extends Throwable{
    private Stack<?> stack; 
    StackUnderflowException(Stack<?> s) { this.stack=s;}
    public String getMessage(){ 
        return "an underflow exception has occurred in "+this.stack.getType();  
    }
    
}
