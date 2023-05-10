import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Store implements Subscriber<Persona> {
    // E' la subscription che tiene insieme 
    // publisher e subscriber conservando 
    // la coda delle item inviate tra loro
    private Subscription sub; 

    @Override
    public void onSubscribe(Subscription s) {
        sub = s;
        sub.request(1); //
    }

    @Override
    public void onNext(Persona p) {
        String nom = p.getNome() + "\t" + p.getCognome();
        System.out.println("Store onNext: " + nom);
        sub.request(1); //pronto a ricevere un'altra notifica
        // una sola, anche se in coda ce ne fossero molte
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("In Store: errore");
    }

    @Override
    public void onComplete() {
        System.out.println("In Store: completato");
    }
}