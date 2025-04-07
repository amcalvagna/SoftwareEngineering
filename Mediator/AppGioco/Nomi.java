
/** Nomi e' un ConcreteColleague */
public class Nomi implements Elemento {
    private final Central m;
    private final String[] seq = { "Monica", "Erica", "Rita", "Tina", "Sandra", "Mary", "Jessica" };
    private final String[] nom = new String[3];
    private final int iniz = 2;
    private int i = 0;

    public Nomi(final Central c) {
        m = c;
        System.out.println("Indovina i successivi tre nomi: " + seq[0] + " " + seq[1] + " ...");
    }

    @Override
    public void put(final String msg) {
        if (i < 3) {
            nom[i] = msg;
            i++;
        }
        if (i == 3)
            doWork();
    }

    @Override
    public String doWork() {
        System.out.println("Hai inserito:  " + nom[0] + "  " + nom[1] + "  " + nom[2]);
        if (seq[iniz].equals(nom[0]) && seq[iniz + 1].equals(nom[1]) && seq[iniz + 2].equals(nom[2])) {
            System.out.println("Benissimo, i nomi sono corretti");
            m.stop();
        } else
            System.out.println("Non hai indovinato i nomi, riprova");
        i = 0;
        return null;
    }

    @Override
    public void put(final int v) {
        if (i == 3)
            System.out.println("Bravo! Hai indovinato la sequenza di nomi");
        else
            System.out.println("Non hai indovinato la sequenza di nomi");
    }

    @Override
    public void reset() {
    }
}