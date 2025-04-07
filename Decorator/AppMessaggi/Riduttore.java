// Riduttore e' un ConcreteDecorator

public class Riduttore extends Modificatore {
    public Riduttore(Messaggio c) {
        super(c);
    }

    // trasforma il testo fornito dal componente piu' interno
    public String getTesto() {
        System.out.print("[Riduttore.getTesto] ");
        String s = super.getTesto();
        s = s.replaceAll("!", "");
        s = s.replaceAll("four", "4");
        s = s.replaceAll("going to", "gonna");
        s = s.replaceAll("would you", "wonna");
        return s;
    }
}
