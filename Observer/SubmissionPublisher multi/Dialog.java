import java.io.IOException;
import java.util.concurrent.SubmissionPublisher;

public class Dialog {

    // creo addresbook con abbinata coda di submission subpub n.1
    private static final AddrBook book1 = new AddrBook(new SubmissionPublisher<>());
    
     // creo una seconda coda di submissions subPub n.2
     private static SubmissionPublisher<Persona> submission2 = new SubmissionPublisher<>();
    // creo un altro book con per gestire un seconda serie di notifiche 
    private static final AddrBook book2 = new AddrBook(submission2);
    
    // creo tre store (subscribers)
    private static final Store st1 = new Store("store1");
    private static final Store st2 = new Store("store2");
    private static final Store st3 = new Store("store3");

    // creo tre item (messaggi)
    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Ringo", "Starr", "012345", "NY");
    private static final Persona p3 = new Persona("Mick", "Jagger", "012345", "NY");
    private static final Persona p4 = new Persona("Ciccio", "Franco", "012345", "NY");
   
    
    public static void main(String[] args) throws IOException {
        // collego due store come subscribers al primo book (e quindi serie di submissions)
        book1.attach(st1);
        book1.attach(st2);
        // subs -> pubs
        // --------------
        // st1 -> b1
        // st2 -> b1


        System.in.read(); //notify st1, st2
        book1.insert(p1);
        book1.insert(p2);
        book1.insert(p3);
        
        System.in.read();
        // collego un terzo subsciber al secondo book
        book2.attach(st3);
        book2.attach(st2); 

        // subs -> pubs
        // --------------
        // st1 -> b1
        // st2 -> b1, b2
        // st3 -> b2
         

        System.in.read();        
        book1.insert(p4); // notify st1, st2
        
        System.in.read();        
        book2.insert(p1); // notify st2, st3
        book2.insert(p4);

        System.in.read(); //st2 receives both!
        book1.close();
        book2.close(); 

    }
}
