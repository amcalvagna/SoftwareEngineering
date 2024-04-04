// Classe Singleton che tiene una lista
// di interi
public class Fib {
  // l’unica istanza e’ tenuta da obj
  private static Fib obj = new Fib();

  private int[] x = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
  private int i = 3;

  private Fib() {
  }
  public static Fib getInstance() {
     return obj; // restituisce l’istanza
  }
  public int getValue() {
if (i < 11) i++;
return x[i-1];
  }
  public void revert() {
     i = 0;
  }
}