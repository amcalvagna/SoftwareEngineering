import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** KeyListen e' un ConcreteColleague */
public class KeyListener implements Elemento {
    private final Central m;
    private BufferedReader inp;

    private int count = 0;

    public KeyListener(final Central c) {
        m = c;
        System.out.println("Scrivi un numero o una lettera e premi invio");
        System.out.println("Per uscire scrivi q");
    }

    @Override
    public String doWork() {
        try {
            inp = new BufferedReader(new InputStreamReader(System.in));
            String str = inp.readLine();
            count++;
            if (count == 10)
                m.stop();
            return str;
        } catch (final IOException ioe) {
            System.err.println(ioe);
        }
        return null;
    }

    @Override
    public void put(final String msg) {
        System.out.println("Hai inserito " + count + " input");
    }

    @Override
    public void put(final int v) { }

    @Override
    public void reset() {
    }
}