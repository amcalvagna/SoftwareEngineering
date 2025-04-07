/** Sommatore e' un ConcreteColleague */

public class Sommatore implements Elemento {
    private final Central m;
    private int somma = 0;
    private int count = 0;
    private int media = 0;

    public Sommatore(final Central c) {
        m = c;
    }

    @Override
    public void put(final String msg) {
        System.out.println(msg);
        doWork();
        System.out.println("La somma e': " + somma);
        System.out.println("La media e': " + media);
    }

    @Override
    public String doWork() {
        if (count > 0)
            media = somma / count;
        return null;
    }

    @Override
    public void put(final int v) {
        count++;
        somma += v;
        if (somma >= 100)
            m.stop();
    }

    @Override
    public void reset() {
        somma = 0;
        count = 0;
    }
}