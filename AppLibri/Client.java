package AppLibri;
/** Client e' una classe che invoca i metodi del Facade Registro */

public class Client {
	private static Libro l1 = new Libro(1);
	private static Libro l2 = new Libro(2);
	private static String nome = "Dan";
	private static Registro r = new Registro();

	public static void main(String[] args) {
		presta("Alan", l1);
		presta("Dan", l2);
		leggi("Alan", l1);
		leggi("Dan", l2);
		
	}

	public static void presta(String nome, Libro lib) {
		System.out.println("-------------------------------------");
		if (r.prestaLibro(nome, lib))
			System.out.println("Prestito registrato");
	}

	public static void leggi(String nome, Libro lib) {
		System.out.println("-------------------------------------");
		if (r.leggiLibro(nome, lib)) 
			System.out.println(nome+" legge "+lib.getTitolo());
	}
}
