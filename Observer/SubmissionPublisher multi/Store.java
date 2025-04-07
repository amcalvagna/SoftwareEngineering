import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.*;

public class Store implements Subscriber<Persona> {
    private List<Subscription> subList = new ArrayList<Subscription>();
    private String storeName;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void onSubscribe(Subscription s) {
        // a subscription is a linked list of clients (subscribers) sharing the
        // same message queue. subscribers can { request(n) / cancel() } that is,
        // stop future calls of onNext
        this.subList.add(s);
        System.out.println(storeName + " subscribed.");
        s.request(1); // comunica disponibilit' a (max) notifica (item)
        // la subscription è l'oggetto che gestisce i buffer per la comunicazione
        // tra subscribers e publishers (è una coda di I/O)
    }

    @Override // riceve ed elabora la notifica
    public void onNext(Persona p) {
        String nom = p.getNome() + "\t" + p.getCognome();
        System.out.println(storeName + " Store onNext: " + nom);
       
        for (int i = 0; i<subList.size(); i++)subList.get(i).request(1); 
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(storeName + " In Store: errore");
    }

    @Override
    public void onComplete() {
        System.out.println(storeName + " In Store: completato");
    }

    @Override
    public String toString() {
        return this.storeName;
    }
}