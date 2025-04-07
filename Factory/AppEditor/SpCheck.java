// Codice Java che mostra l'uso di dependency injection e object pool con il pattern Factory Method

/** SpCheck svolge il ruolo di Product */

public interface SpCheck {
	/** Controlla che la parola usata appartenga al dizionario */
	public boolean check(String word);
}