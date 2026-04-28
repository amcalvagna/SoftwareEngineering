import java.util.ArrayList;
import java.util.List;

public class AddrBook extends Subject {
    private List<Persona> nomi = new ArrayList<>();

    public void insert(Persona p) {
        if (nomi.contains(p)) 
            return;
        nomi.add(p);
        setChanged(); // la prossima notifica avverra’
        notify(nomi); // notifica i ConcreteObserver
        
    }

    public void insert(List<Persona> l){
        for(Persona p :l ) {
                if (nomi.contains(p)) continue;
                nomi.add(p);
                setChanged();
        }
        notify(nomi);
    }

    public Persona find(String cognome) {
        for (Persona p : nomi)
            if (p.getCognome().equals(cognome))
                return p;
        System.out.println("AddrBook.find: NOT found");
        return null;
    }
}