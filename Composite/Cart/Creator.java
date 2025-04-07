/**
 * Creator svolge il ruolo di ConcreteCreator per il design pattern Factory
 * Method,
 * fornisce vari metodi factory per istanziare Leaf o Composite
 **/

public class Creator {
    private static final String[] libri = { "Gamma Design Pattern", "Fowler Refactoring", "Beck Extreme Programming",
            "Fowler UML Distilled" };
    private static final float[] prezzi = { 38.5f, 40.0f, 28.5f, 22 };
    private static final int[] pesi = { 650, 700, 300, 200 };

    private static int i = -1;

    public static Prodotto getCarrello() {
        System.out.println("Creator: istanzio Carrello");
        return new Carrello();
    }

    public static Prodotto getLibro() {
        System.out.println("Creator: istanzio Libro");
        aggiornaIndice();
        return new Libro(libri[i], prezzi[i], pesi[i]);
    }

    public static Prodotto getEbook() {
        System.out.println("Creator: istanzio EBook");
        aggiornaIndice();
        return new EBook(libri[i], prezzi[i]);
    }

    private static void aggiornaIndice() {
        if (i < libri.length - 1)
            i++;
        else
            i = 0;
    }
}
