import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;

//address book è un publisher di item, che opera attraverso gestori delegati
// ovvero oggetti di tipo submissionPublisher. posso averne diversi,
// per rappresentare gruppi di client interessati a notifiche (item) diverse
// sono asincroni (non bloccanti) e lavorano in parallelo usando threads 
public class AddrBook {
  private List<Persona> nomi = new ArrayList<>();
  private SubmissionPublisher<Persona> mypubl;
  // è un gestore di sottoscrizioni, ovvero di un gruppo di clients (subscribers)

  //il legame di composizione consente di avere istanze diverse 
  // di subpub per ogni address book
  public AddrBook(SubmissionPublisher<Persona> publ) { 
    if (publ != null)
      this.mypubl = publ;
  }

  public void attach(Subscriber<Persona> s) {
    mypubl.subscribe(s); // internamente invoca onSubscribe() su s passandogli la subscription policy di
                         // default (fork/join thread pool)
  }

  public boolean insert(Persona p) {
    // if (nomi.contains(p))
    // return false;
    nomi.add(p);
    mypubl.submit(p); // submit invoca onNext(p) in parallelo su tutti i subscribers
    System.out.println("AddBook>> subscribers notificati!");
    return true;
  }

  public void close() {
    // System.out.println("AddBook>> passo e chiudo!");
    mypubl.close();
  }

}
