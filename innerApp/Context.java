public class Context{ 
	// dati privati da non rivelare se non alla strategia
	private int data = 10;

	public void executeTask(Strategy s) {// strategia ricevuta come parametro 
		System.out.println(s.appliedStrategy(data) + ", has been used to execute requested task"); 
	} 
}
