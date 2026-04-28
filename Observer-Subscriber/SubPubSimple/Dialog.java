public class Dialog {

    private static final AddrBook book1 = new AddrBook();

    private static final Store st1 = new Store();

    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Sylvester", "Stallone", "012345", "NY");
    private static final Persona p3 = new Persona("Tommy", "Cruise", "012345", "NY");
    private static final Persona p4 = new Persona("Brad", "Pitt", "012345", "NY");  
    public static void main(String[] args) throws InterruptedException {
        book1.attach(st1);
        
        book1.insert(p1);

        book1.insert(p2);

        book1.insert(p3);

        book1.insert(p4);

        Thread.sleep(500); // se non aspetto non fa in tempo a processare le notifica....
        
        book1.close(); // chiude il publisher e quindi anche il subscriber
    }
}
