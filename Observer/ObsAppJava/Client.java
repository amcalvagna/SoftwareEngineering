import java.io.IOException;

// Classe con il main che usa il design pattern
public class Client {
    private Registro r = new Registro();
    private Monitor m = new Monitor();

    public static void main(String[] args) throws IOException {
        Client c = new Client();
        c.test();
    }

    private void test() throws IOException {
        r.addObserver(m);
        System.in.read();
        r.ritira(500);

        System.in.read();
        r.deposita(1200);

        System.in.read();
        r.deposita(500);

        System.in.read();
        System.out.println("Saldo attuale: " + r.getBilancio() + " euro");
        System.out.println("Il subject ha effettuato " + m.getNumOperazioni() + " operazioni");
    }
}
