public class Libro {
	String titolo;
	Categoria categoria;
	int prezzo;
	
	public static void main(String[] args) {
		System.out.println();
	}
	
	private static Libro[] prodPool = new Libro[] {
			new Libro("Leviathan", Categoria.FANTASY, 20),
			new Libro("Trono di Spade", Categoria.FANTASY, 40),
			new Libro("Signore degli Anelli", Categoria.FANTASY, 25),
			
			new Libro("Neuromante", Categoria.CYBERPUNK, 15),
			new Libro("Monnalisa Cyberpunk", Categoria.CYBERPUNK, 12),
			new Libro("Mirrorshades", Categoria.CYBERPUNK, 10),
			
			new Libro("Profondo Blu", Categoria.THRILLER, 8),
			new Libro("Invasion", Categoria.THRILLER, 12),
			new Libro("Il Collezionista D'Ossa", Categoria.THRILLER, 18),
			
			new Libro("Harry Potter", Categoria.FANTASY, 60000),
			new Libro("Storia di una capinera", Categoria.STORICO, 5),
			new Libro("Design Pattern", Categoria.INFORMATICA, 35)
			};
			
	
	public static Libro gen() {
		int i = (int) (Math.random() * prodPool.length);
		return prodPool[i];
	}
	
	public Libro(String nome, Categoria categoria, int prezzo) {
		this.titolo = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return titolo + " (" + categoria + ", " + prezzo + "€)";
	}
	
}
