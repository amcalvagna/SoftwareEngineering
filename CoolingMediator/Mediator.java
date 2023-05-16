
public interface Mediator {

    void start();
    // metodi che prima erano invocati direttamente tra gli oggetti
    // e ora sono inviati per tramite del mediator

    void stop();

    void press();

}
