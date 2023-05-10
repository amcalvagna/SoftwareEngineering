import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

public class AddrBook {
  private List<Persona> nomi = new ArrayList<>();

  // coda di notifiche e relativo set di observers destinatari
  // su questa invoco submit (notify) e subscribe(addObserver)
  private SubmissionPublisher<Persona> publ = new SubmissionPublisher<>();
  // posso averne anche più di una...

  public void attach(Subscriber<Persona> s) {
    publ.subscribe(s); // addObserver
  }

  public boolean insert(Persona p) {
    if (nomi.contains(p))
      return false;
    nomi.add(p);
    publ.submit(p); // notifyObserver, concorrente
    return true;
  }

  public void close() throws InterruptedException {
    System.out.print("closing Address Book...\n");
    //
    Thread.sleep(400); // se non aspetto non fa in tempo a eseguite la
    // notifica....
    publ.close();

  }
}
