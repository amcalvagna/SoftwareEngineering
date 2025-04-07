import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Store implements Observer {
    @Override
    public void update(Subject s, Object o) {  //il subject non è usato...
        List<Persona> l = (List<Persona>) o; 

        String nom;
        try (FileWriter f = new FileWriter("nomi.txt")) {
            for (Persona p : l) {
                nom = p.getNome() + "\t" + p.getCognome() +
                        "\t" + p.getTelefono();
                f.write(nom + "\n");
            }
        } catch (IOException e) {
        }
    }
}
