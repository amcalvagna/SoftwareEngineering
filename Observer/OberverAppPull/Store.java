import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Store implements Observer {
    @Override
    public void update(Subject s) {  //modello pull dello stato
         List<Persona> l = (List<Persona> )s.getState() ; //creo una dipendenza...
         //meglio dipendere dallo stato, piuttosto che dal subject...

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
