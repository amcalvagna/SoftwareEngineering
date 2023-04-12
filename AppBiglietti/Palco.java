// Palco e' un ConcreteProduct
import java.util.Random;

public class Palco implements Posto {
	private final int numero;

	public Palco() {
		numero = new Random().nextInt(20) + 1;
	}

	@Override
	public int getCosto() {
		if (numero > 10) return 50;
		return 40;
	}

	@Override
	public String getPosizione() {
		return Integer.toString(numero);
	}

	@Override
	public String getSettore() {
		if (numero == 20) return "Centrale";
		if (numero > 10) return "Verde";
		return "Blu";
	}
}