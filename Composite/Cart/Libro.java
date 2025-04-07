/**
 * Libro svolge il ruolo di Leaf per il design pattern Composite
 */

public class Libro implements Prodotto {
    private String titolo;
    private float prezzo;
    private int peso;

    public Libro(String titol, float prez, int pes) {
        titolo = titol;
        prezzo = prez;
        peso = pes;
    }

    @Override
    public void print() {
        System.out.println("Libro: " + titolo + "\tPrezzo: " + getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return prezzo;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public void add(Prodotto p) {
    }

    @Override
    public void remove(Prodotto p) {
    }
}