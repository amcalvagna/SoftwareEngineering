/** Numeri e' un ConcreteColleague */
public class Numeri implements Elemento {
    private final Central m;
    private final int[] seq = { 8, 13, 21 };
    private final int[] num = new int[3];
    private int i = 0;

    public Numeri(final Central c) {
        m = c;
        System.out.println("Indovina i successivi tre numeri della sequenza 2, 3, 5, ...");
    }

    @Override
    public void put(final String msg) {
        System.out.print(msg + " ");
        if (i == 3)
            System.out.println("Bravo, sequenza corretta");
        else
            System.out.println("Sequenza non corretta");
    }

    @Override
    public String doWork() {
        System.out.println("Hai inserito:  " + num[0] + "  " + num[1] + "  " + num[2]);
        if (seq[0] == num[0] && seq[1] == num[1] && seq[2] == num[2]) {
            System.out.println("Hai indovinato la sequenza");
            m.stop();
        } else
            System.out.println("Non hai indovinato la sequenza, riprova");
        i = 0;
        return null;
    }

    @Override
    public void put(final int v) {
        if (i < 3) {
            num[i] = v;
            i++;
        }
        if (i == 3)
            doWork();
    }

    @Override
    public void reset() {
        i = 0;
    }
}
