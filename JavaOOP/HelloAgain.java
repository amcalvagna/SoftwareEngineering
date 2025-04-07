import java.time.LocalDate; // indica dove trovare la classe LocalDate

public class HelloAgain { // dichiara classe HelloWorld
	private static final String msg = "Lezione di Ingegneria del Software";
	private LocalDate d; // dichiara campo d di tipo LocalDate
	
	public static void main(String[] args) {
		System.out.println("Hello World"); // scrive su schermo
		System.out.println(msg);
		final HelloAgain world = new HelloAgain(); // crea oggetto
		world.printDate(); // chiama metodo
	}
	
	private void printDate() { // metodo
		d = LocalDate.now();    // chiama metodo static now
		System.out.println(d);
	}
}