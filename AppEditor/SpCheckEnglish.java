/** SpCheckEnglish svolge il ruolo di ConcreteProduct */

public class SpCheckEnglish implements SpCheck {

	@Override
	public boolean check(String word) {
		// TODO: Dovrebbe usare il dizionario inglese e le regole per stemming,
		// troncamento, etc.
		return word.equals("hello");
	}

}