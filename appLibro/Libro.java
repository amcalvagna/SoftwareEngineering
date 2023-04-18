import java.util.Arrays;
import java.util.List;

public class Libro { // Context
    private String testo = "Darwin's _Origin of Species_ persuaded the world that the "
            + "difference between different species of animals and plants is not the fixed "
            + "immutable difference that it appears to be.";
    private List<String> lista = Arrays.asList(testo.split("[\\s+]+"));
    private Display mode = new Colonna();

    public void mostra() {
        mode.scrivi(lista);
    }

    public void setMode(int x) {
        switch (x) {
            case 1:
                mode = new Colonna();
                break;
            case 2:
                mode = new SingolaParola();
                break;
        }
    }
}
