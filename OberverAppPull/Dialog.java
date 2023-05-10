import java.io.IOException;

public class Dialog {
    private static final AddrBook book = new AddrBook();
    private static final Store st = new Store();
    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Saro", "Falsaperla", "54321", "CT");

    public static void main(String[] args) throws IOException {
        book.attach(st);
        
        System.in.read();        
        book.insert(p1);
        
        System.in.read();        
        book.insert(p2);
        
    }
}