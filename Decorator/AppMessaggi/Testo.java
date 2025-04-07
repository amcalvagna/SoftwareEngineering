// Testo e' un ConcreteComponent

public class Testo implements Messaggio {
    private String dest;
    private String testo;

    public Testo(String d, String t) {
        dest = d;
        testo = t;
    }

    public String getDestin() {
        System.out.print("[Testo.getDestin] ");
        return dest;
    }

    public String getTesto() {
        System.out.print("[Testo.getTesto] ");
        return testo;
    }
}
