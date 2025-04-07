import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obs = new ArrayList<>();
    private boolean changed = false;

    public void notify(Subject s) {
        if (!changed)
            return;
        for (Observer o : obs)
            o.update(s); // indico anche il subject: N2N
        changed = false;
    }

    // consento al concrete subject di ottenere stato in pull
    // non necessaria anche qui, se il concreteObserver 
    // già conosce (dipende da) il ConcreteSubject
    Object getState(){return null;}; 

    public void setChanged() {
        changed = true;
    }

    public void attach(Observer o) {
        obs.add(o);
    }

    public void detach(Observer o) {
        obs.remove(o);
    }
}
