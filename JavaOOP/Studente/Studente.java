import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona {
    private String matr;
    private List<Esame> esami = new ArrayList<>();

    public Studente(String n, String c){
      super(n, c);
    }

    public void setMatr(String m) { matr = m; }
    
    public void nuovoEsame(String m, int v) {
      Esame e = new Esame(m, v);
      esami.add(e);
    }
    public float getMedia() {
      if (esami.isEmpty()) return 0;
      float sum = 0;
      for (Esame e : esami) sum += e.getVoto();
      return sum / esami.size();
    }
    public void printAll() {
      super.printAll();
      System.out.println("matr: " + matr);
      for (Esame e : esami)
        System.out.println(e.getMat() + ": " + e.getVoto());
      System.out.println("media: " + getMedia());
    }

    public String toString() {
        //return this.nome+this.co;
        //return super.nome+super.co;
        return super.toString();
    }
    

  }