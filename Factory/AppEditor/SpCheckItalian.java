/** SpCheckItalian svolge il ruolo di ConcreteProduct */

public class SpCheckItalian implements SpCheck {

	@Override
	public boolean check(String word) {
		// TODO: Dovrebbe usare il dizionario italiano e le regole per stemming,
		// troncamento, etc.
		return word.equals("ciao");
	}
}