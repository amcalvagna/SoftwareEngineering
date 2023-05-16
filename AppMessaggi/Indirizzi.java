// Indirizzi e' un ConcreteDecorator

public class Indirizzi extends Modificatore {
    public Indirizzi(Messaggio c) {
        super(c);
    }

    // fa corrispondere un numero al destinatario
    public String getDestin() {
        System.out.print("[Indirizzi.getDestin] ");
        String s = super.getDestin();
        s = s.replaceFirst("Tano", "3336543211");
        s = s.replaceFirst("Saro", "3939685732");
        return s;
    }
}
