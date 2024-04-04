public class MainFib {
    public static void main(String[] args) {
      // richiede una istanza di Fib
      Fib f = Fib.getInstance();
      System.out.print("f "+f.getValue());
      System.out.println(" "+f.getValue());
  
      // richiede una nuova istanza
      Fib f2 = Fib.getInstance();
      System.out.print("f2 "+f2.getValue());
      System.out.println(" "+f2.getValue());
     
      // Si ha un errore a compile-time con:
      // Fib f3 = (Fib) f2.clone();
      // Fib f4 = new Fib();
    }
  }