import java.util.ArrayList;
import java.util.List;

public class AddrBook extends Subject {
    private List<Persona> nomi = new ArrayList<>();

    public void insert(Persona p) {
        if (nomi.contains(p))
            return;
        nomi.add(p);
        setChanged(); // la prossima notifica avverra’
        notify(this); // notifica i ConcreteObserver
        // nota come in questa classe non ci sia idea 
        // che esista, come è fatta, e come reagisca la classe Store 
    }

    Object getState(){ return this.nomi;} 

    // ricevo nomi che erano salvati e mancano qui
    void setState(List<Persona> missing ) { 
        for (Persona p : missing) nomi.add(p);
    }

    public Persona find(String cognome) {
        for (Persona p : nomi)
            if (p.getCognome().equals(cognome))
                return p;
        System.out.println("AddrBook.find: NOT found");
        return null;
    }
}