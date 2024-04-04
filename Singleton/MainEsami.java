public class MainEsami {
    public static void main(String[] args) {
      Studente s = new Studente("Alan", "Rossi");   // metodo della superclasse di s
      s.setMatr("M12345");
      s.nuovoEsame("Italiano", 8);  // metodo della classe di s
      s.printAll();                 // metodo della classe di s
  
      s.nuovoEsame("Fisica", 7);
      Persona p = s;   // p e' dichiarato di tipo Persona
      p.printAll();    // a runtime p punta all'istanza s 
    }

    public void pippo(Persona s){
      s.printAll();  }
  }