import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Store implements Observer {
    @Override
    public void update(Subject s) {  //modello pull dello stato
         List<Persona> l = (List<Persona>) s.getState() ; 

        try (FileWriter f = new FileWriter("nomi.txt")) {
            for (Persona p : l) {
                f.write(p + "\n");
                System.out.println("saved: "+p);
            }
        } catch (IOException e) {
        }
    }
}
