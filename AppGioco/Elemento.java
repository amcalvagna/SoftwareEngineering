// Esempio per il design pattern Mediator
/** Elemento e' un Colleague */

public interface Elemento {
    public void put(final String s);   

    public void put(final int v);

    public String doWork();

    public void reset();
}