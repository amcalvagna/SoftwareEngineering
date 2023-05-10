public class Dialog {

    private static final AddrBook book1 = new AddrBook();

    private static final Store st1 = new Store();

    private static final Persona p1 = new Persona("Oliver", "Stone", "012345", "NY");
    private static final Persona p2 = new Persona("Sylvester", "Stallone", "012345", "NY");

    public static void main(String[] args) throws InterruptedException {
        book1.attach(st1);
        
        book1.insert(p1);

        book1.close();
        // book1.insert(p2);

        // se termino Dialog il thread di notifica termina
        // prima ancora che finisca e appaia la stampa.
    }
}
