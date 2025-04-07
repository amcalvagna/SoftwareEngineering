// Biglietto e' un client del Product Posto
public class Biglietto {
	private String nome;
	private final Posto pos;
	
	public Biglietto(Posto p) {
		pos = p;
	}
	
	public void intesta(String s) {
		nome = s;
	}
	
	public String getDettagli() {
		return nome.concat(" ").concat(pos.getPosizione());
	}
	
	public String getNome() {
		return nome;
	}

	public int getCosto() {
		return pos.getCosto();
	}
}