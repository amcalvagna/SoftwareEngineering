// Modificatore e' un Decorator

public class Modificatore implements Messaggio {
    private Messaggio p;

    public Modificatore(Messaggio c) {
        p = c;
    }

    public String getDestin() {
        System.out.print("[Modificatore.getDestin] ");
        return p.getDestin();
    }

    public String getTesto() {
        System.out.print("[Modificatore.getTesto] ");
        return p.getTesto();
    }
}
