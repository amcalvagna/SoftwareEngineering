/** Central e' un Mediator */
public class Central {
    private Elemento s = new Sommatore(this);
    private Elemento k = new KeyListener(this);
    private Elemento n = new Numeri(this);
    private Elemento nm = new Nomi(this);

    private boolean active = true;

    //attiva il keyListener in loop
    public void init() {
        String s;
        do {
            s = k.doWork();
            if (s.equals("q"))
                break;
            alert(s);
        } while (active);
    }

    //smista il dato letto da keyList. agli altri nodi n,s,nm
    //è una funzione interna di central
    public void alert(String str) {
        try {
            int v = Integer.parseInt(str);
            s.put(v);
            n.put(v);
        } catch (NumberFormatException nfe) {
            n.reset();
            s.reset();
            nm.put(str);
        }
    }

    //smista lo stop quando lo riceve 
    public void stop() {
        active = false;
        n.put("Numeri:");
        s.put("Somma:");
        nm.put(0);
    }
}