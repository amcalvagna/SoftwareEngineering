/**
 * L'applicazione che usa il Design Pattern Composite consiste dell'interfaccia
 * Prodotto (Component), e delle classi Libro e EBook (Leaf), della classe
 * Creator che istanzia oggetti, della classe Carrello (Composite) per
 * raggruppare istanze, e del client MainCart che chiama operazioni su Leaf e
 * Composite.
 */

public class MainCart {
    private static final Prodotto cart = Creator.getCarrello();
    private static final Prodotto lib = Creator.getLibro();
    private static final Prodotto eb = Creator.getEbook();

    public static void main(final String[] args) {
        System.out.println("\nChiama print su lib");
        lib.print();
        System.out.println("Peso di lib " + lib.getPeso());

        System.out.println("\nInserimento di Libri in Carrello");
        cart.add(lib);
        cart.add(eb);

        System.out.println("\n");
        cart.print();
        System.out.println("\nPeso del Carrello " + cart.getPeso());
    }
}
