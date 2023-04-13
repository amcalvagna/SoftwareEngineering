import java.util.ArrayList;
import java.util.List;

/**
 * CreatorText svolge il ruolo di ConcreteCreator e usa la dependency injection
 * per la classe TextEditor. Vantaggio: TextEditor non conosce il tipo
 * dell'istanza usata, e si ha un unico posto per istanziare TextEditor e la
 * sottoclasse di SpCheck.
 **/

public class CreatorText {
	private static List< TextEditor > pool = new ArrayList< >();

	public static void poolSetUp(int poolSize){ 
			for (int i=1; i<poolSize; i++) pool.add(new TextEditor(new SpCheckEnglish())); 				
	}

	public static TextEditor getEng() {
		System.out.println("Crea un TextEditor con English");
		return new TextEditor(new SpCheckEnglish());
	}

	public static TextEditor getIta() {
		System.out.println("Crea un TextEditor con Italian");
		return new TextEditor(new SpCheckItalian());
	}

	// TODO: Aggiornare il diagramma UML delle classi
	/** ritorna, se esiste, una istanza dal pool */
	public static TextEditor getFromPool() {
		if (!pool.isEmpty()) return pool.remove(0); 
		return null;
	}

	// TODO: Aggiornare il diagramma UML delle classi
	/** rilascia l'istanza */
	public static void release(TextEditor t) {
		pool.add(t);
	}
}