package stackJava;

public class StackMain {
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
}
