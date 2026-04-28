//package OberverApp;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Store implements Observer {
    @Override
    public void update(Object o) {  //il subject non è usato...
        //@SuppressWarnings("unchecked")
        List<Persona> l = (List<Persona>) o; // cast a List<Persona>
        System.out.println("Updating Local Store...");
        try (FileWriter f = new FileWriter("nomi.txt")) {
            for (Persona p : l) {
                f.write(p + "\n");
                System.out.println("saved:\t" +p);
            }
        } catch (IOException e) {
        }
    }
}
