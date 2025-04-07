import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obs = new ArrayList<>();
    private boolean changed = false;

    public void notify(Object state) {
        if (!changed)
            return;
        for (Observer o : obs)
            o.update(this, state); // indico anche il subject: N2N
        changed = false;
    }

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
