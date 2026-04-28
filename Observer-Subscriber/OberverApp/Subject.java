import java.util.ArrayList;
import java.util.List;

//self made Subject class
public class Subject {
    private List<Observer> obs = new ArrayList<>();
    private boolean changed = false;

    public void notify(Object state) {
        if (!changed) return;
        obs.forEach((o)-> o.update(state)); // indico anche il subject: N2N
            
        changed = false;
    }

    public void setChanged() {
        changed = true;
    }
    public void clearChanged() {
        changed = false;
    }
    public boolean hasChanged() {
        return changed;
    }
    
    public void attach(Observer o) {
        obs.add(o);
    }

    public void detach(Observer o) {
        obs.remove(o);
    }
}
