
// Registro e' un ConcreteSubject
import java.util.Observable;

public class Registro extends Observable {
    private double bilancio = 0;

    public boolean ritira(double somma) {
        System.out.println("Prelievo di " + somma + " euro");
        if (bilancio >= somma) {
            bilancio -= somma;
            setChanged();
            notifyObservers(bilancio);
            return true;
        }
        System.out.println("Operazione non permessa");
        return false;
    }

    public void deposita(double somma) {
        System.out.println("Deposito di " + somma + " euro");
        bilancio += somma;
        setChanged();
        notifyObservers(bilancio);
    }

    public double getBilancio() {
        return bilancio;
    }
}