public class Persona {
    
    private String nome, co;
    public Persona(String n, String c) {
      nome = n; co = c;
    }
    public void printAll() {
      System.out.println(nome + " " + co);
    }

    public String toString(){
      return nome+" "+co;
    }
  
}
