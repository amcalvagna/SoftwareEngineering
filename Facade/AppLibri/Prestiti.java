package AppLibri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/** 
 * Prestiti tiene una lista dei libri prestati, e' una classe del sottosistema
 */
public class Prestiti {
	// tabPrestati e' la tabella dei prestiti: la chiave e' il nome della
	// persona, il valore e' la lista dei titoli dei libri presi in prestito
	private Map< String, List< String >> tabPrestati = new HashMap< >();

	public void registra(String nome, String libro) {
		System.out.println("Prestiti: prendi libro");
		if (tabPrestati.containsKey(nome))
			tabPrestati.get(nome).add(libro);
		else {
			List< String > lis = new ArrayList< >();
			lis.add(libro);
			tabPrestati.put(nome, lis);
		}
	}

	public String trovaPersona(String libro) {
		System.out.println("Prestiti: trova persona");
		for (String s : tabPrestati.keySet())
			if (tabPrestati.get(s).contains(libro)) return s;
		return null;
	}
}