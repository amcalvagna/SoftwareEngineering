package AppLibri;
import java.util.Arrays;
import java.util.List;


/** 
 * Socio verifica se un utente e' registrato. Socio e' una classe del sottosistema
 */
public class Socio {
	private final List< String > listaSoci = Arrays.asList("Alan", "Dan");

	public boolean verificaId(String nome) {
		System.out.println("Socio: in controlla id");
		return listaSoci.contains(nome);
	}
}
