// File: Dialog.java
import java.io.IOException;
import java.util.Arrays;

public class Dialog {
    private static final AddrBook book = new AddrBook();
    private static final Store st = new Store();
    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Saro", "Falsaperla", "54321", "CT");
    private static final Persona p3 = new Persona("Pippo", "Scandurra", "2330203","ME");

    public static void main(String[] args) throws IOException {
        Persona p;
        book.attach(st);
        
        System.in.read();        
        book.insert(p1);
        
        System.in.read();        
        p = book.find("Falsaperla");
        if(p!=null) System.out.println("Found: "+p);

        System.in.read();        
        book.insert(p2);

        System.in.read();        
        p = book.find("Falsaperla");
        if(p!=null) System.out.println("Found: "+p);

        System.in.read();
        book.insert(p1); // non viene aggiunto, non viene notificato

        System.in.read();        
        book.insert(Arrays.asList(p1, p2));  // non viene aggiunto, non viene notificato

        System.in.read();        
        book.insert(Arrays.asList(p1, p2, p3));
         
    }
}