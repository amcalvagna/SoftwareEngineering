// Codice Java che implementa il design pattern Observer

// Monitor e' un ConcreteObserver
import java.util.Observer;
import java.util.Observable;

public class Monitor implements Observer {
    private int numOperazioni = 0;

    @Override
    public void update(Observable obs, Object s) {
        System.out.println("Monitor: Il saldo e' di euro " + s);
        numOperazioni++;
    }

    public int getNumOperazioni() {
        return numOperazioni;
    }
}