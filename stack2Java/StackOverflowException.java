package stack2Java;

public class StackOverflowException extends Exception {
    private Stack<?>  stack; 
    StackOverflowException(Stack<?> s) {this.stack=s;}
    public String getMessage(){ 
        return "an overflow exception has occurred in "+this.stack.getType();  
    }
    
}
