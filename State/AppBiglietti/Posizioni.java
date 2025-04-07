
// Posizioni e' un ConcreteCreator con un metodo factory
public class Posizioni extends GnrPosizioni {
	// metodo factory che ritorna una istanza
	@Override
	public Posto getPosto(int tipo) {
		// crea l'istanza di un ConcreteProduct 
		if (1 == tipo) return new Palco();
		return new Platea();
	}
}