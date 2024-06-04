import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		
		esempioMul(); // Esempio mul (Funzione di ordine superiore: restituisce funzioni)
		
		query0(); // Stampare 10 libri (usando generate)
		query1(); // Contare tutti i libri CYBERPUNK
		query2(); // Lista dei titoli dei libri CYBERPUNK o FANTASY 
		query3(); // Somma dei costi di tutti i libri
		query4(); // Somma in dollari dei costi di tutti i libri (1 EUR = 1.12 USD)
		query5(); // Stampa tutti i libri con prezzo compreso tra 10€ e 15€
		query6(); // Titolo del Libro meno caro (ma a partire da 12€)
		query7(); // Stampa la lista dei libri ordinati per prezzo
		
		query8(); // Stampa il conteggio vendite per ogni libro (senza groupingBy)
		query9(); // Stampa i libri raggruppati per categoria (senza groupingBy)
		
		query10(); // Creare una lista di libri fantasy da "Harry Potter 1" a "Harry Potter 7", tutti da 15 euro 
		query11(); // Sfruttando il metodo precedente, ottenere la lista di libri e mescolarla in ordine casuale
		query12(); // Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Pura)
		query13(); // Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Non Pura)
		query14(); // Data una lista di libri, applicare ad ogni libro uno sconto che dipende dalla categoria
				   // -	FANTASY -5€
				   // -	CYBERPUNK -10%
				   // -	THRILLER -50%
		           // -	STORICO -0€
		           // -	INFORMATICA x2+10€ (niente sconti per noi programmatori...)
	
	
	}

	// Esempio mul (Funzione di ordine superiore: restituisce funzioni)
	private static void esempioMul() {
		Function<Integer, Integer> mul2 = getMul(2);
		Function<Integer, Integer> mul3 = getMul(3);
			
		System.out.println(mul2.apply(10));
		System.out.println(mul3.apply(100));
	}
	
	private static Function<Integer,Integer> getMul(int p) {
		return (x -> x * p);
	}

	// Stampare 10 libri
	public static void query0() {
		System.out.println("# Query 0");
		
		Stream.generate(Libro::gen)
			.limit(10)
			.forEach(System.out::println);
	}
	
	// Contare tutti i libri CYBERPUNK
	public static void query1() {
		System.out.println("\n# Query 1");
		long cnt = Stream.generate(Libro::gen)
				.limit(10)
				.filter(x -> x.getCategoria() == Categoria.CYBERPUNK)
				.peek(System.out::println)
				.count();
			
			System.out.println(cnt);
	}
	
	// Lista dei titoli dei libri CYBERPUNK o FANTASY 
	public static void query2() {
		System.out.println("\n# Query 2");
		List<String> list = Stream.generate(Libro::gen)
				.limit(10)
				.filter(x -> x.getCategoria() == Categoria.CYBERPUNK
						|| x.getCategoria() == Categoria.FANTASY)
				.map(Libro::getTitolo)
				.collect(Collectors.toList());
				
		list.forEach(System.out::println);
	}
	
	// Somma dei costi di tutti i libri
	public static void query3() {
		System.out.println("\n# Query 3");
		int sum = Stream.generate(Libro::gen)
			.limit(5)
			.peek(System.out::println)
			.map(Libro::getPrezzo)
			.reduce(0, Integer::sum);

		System.out.println("Somma = " + sum);
	}
	
	// Somma in dollari dei costi di tutti i libri (1 EUR = 1.12 USD)
	public static void query4() {
		System.out.println("\n# Query 4");
		long sum = Stream.generate(Libro::gen)
			.limit(5)
			.map(Libro::getPrezzo)
			.map(x -> x * 1.12)
			//.peek(System.out::println)
			.map(Math::round)
			.peek(System.out::println)
			.reduce(0l, Long::sum);
		System.out.println("Somma = " + sum);
	}
	
	
	// Stampa tutti i libri con prezzo compreso tra 10€ e 15€
	public static void query5() {
		System.out.println("\n# Query 5");
		Stream.generate(Libro::gen)
			.limit(5)
			.filter(x -> x.getPrezzo() >= 10)
			.filter(x -> x.getPrezzo() <= 15)
			.forEach(System.out::println);
	}
	
	// Titolo del Libro meno caro (ma a partire da 12€)
	public static void query6() {
		System.out.println("\n# Query 6");
		Optional<Libro> book = Stream.generate(Libro::gen)
			.limit(5)
			.filter(x -> x.getPrezzo() >= 12)
			.min(Comparator.comparing(Libro::getPrezzo));
		
		if (book.isPresent())
			System.out.println("Libro: " + book.get());
		else
			System.out.println("Nessun libro rispetta i criteri");
	}
	
	// Stampa la lista dei libri ordinati per prezzo
	public static void query7() {
		System.out.println("\n# Query 7");
		Stream.generate(Libro::gen)
			.limit(10)
			.sorted(Comparator.comparing(Libro::getPrezzo))
			.forEach(System.out::println);
	}
	
	// Totale vendite per ogni libro venduto (SENZA groupingBy)
	public static void query8() {
		System.out.println("\n# Query 8");
		List<Libro> list = Stream.generate(Libro::gen)
				.limit(5)
				.collect(Collectors.toList());
				
		list.stream()
			.map(Libro::getTitolo)
			.distinct()
			.peek(t -> System.out.print("Titolo: " + t + " Conteggio: "))
			.forEach(t -> System.out.println(
						list.stream()
							.filter(x -> x.getTitolo().equals(t))
							.count()));
	}
	
	// Libri raggruppati per categoria (SENZA groupingBy)
	public static void query9() {
		System.out.println("\n# Query 9");
		List<Libro> list = Stream.generate(Libro::gen)
				.limit(5)
				.collect(Collectors.toList());
		
		list.stream()
			.map(Libro::getCategoria)
			.distinct()
			.peek(c -> System.out.println("Categoria: " + c))
			.forEach(c -> list.stream()
						.filter(x -> x.getCategoria() == c)
						.map(Libro::getTitolo)
						.forEach(t -> System.out.println("- " + t)));
	}
	
	// Creare una lista di libri fantasy da "Harry Potter 1" a "Harry Potter 7", tutti da 15 euro 
	private static List<Libro> query10() {
		System.out.println("\n# Query 10");
		List<Libro> list = IntStream.rangeClosed(1,7)
				.mapToObj(n -> new Libro("Harry Potter " + n, Categoria.FANTASY, 15))
				.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		return list;
	}
	
	// Sfruttando il metodo precedente, ottenere la lista di libri e mescolarla in ordine casuale
	private static void query11() {
		System.out.println("\n# Query 11");
		List<Libro> inputList = query10();
		
		System.out.println();
		
		Stream.generate(() -> (int)(Math.random() * inputList.size()))
				.distinct()
				.limit(inputList.size())
				.map(i -> inputList.get(i))
				.forEach(System.out::println);
	}
	
	// Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Pura)
	private static void query12() {
		System.out.println("\n# Query 12");
		List<Libro> list = Stream.generate(Libro::gen)
			.limit(2)
			.peek(System.out::println)
			.collect(Collectors.toList());
				
		System.out.println();
				
		IntStream.range(1, list.size())
			.filter(i -> list.get(i-1).getPrezzo() < list.get(i).getPrezzo())
			.mapToObj(i -> list.get(i))
			.peek(System.out::println)
			.findAny();		// scarto il risultato (Optional<Libro>)
	}
	
	// Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Non Pura)
	private static void query13() {
		System.out.println("\n# Query 13");
		List<Libro> list = Stream.generate(Libro::gen)
			.limit(10)
			.peek(System.out::println)
			.collect(Collectors.toList());
		
		System.out.println();
		
		list.stream()
			.filter(x -> isBiggerThanPrev(x))
			.peek(System.out::println)
			.findAny();		// scarto il risultato (Optional<Libro>)
	}
	
	private static Libro prev = null;
	private static boolean isBiggerThanPrev(Libro x) {
		if (prev == null) {
			prev = x;
			return false;
		}
		
		boolean ret = prev.getPrezzo() < x.getPrezzo();
		prev = x;
		
		return ret;
	}
	
	private static void query14() {
		System.out.println("\n# Query 14");
		
		List<Libro> list = Stream.generate(Libro::gen)
				.limit(5)
				.peek(System.out::println)
				.collect(Collectors.toList());
				
		list.forEach(x -> x.setPrezzo(
				getSconto(x.getCategoria()).apply(x.getPrezzo())));
		
		System.out.println();
		list.forEach(System.out::println);
		
	}
	
	private static Function<Integer,Integer> getSconto(Categoria cat) {
		Map<Categoria, Function<Integer, Integer>> sconti = Map.of(
				Categoria.FANTASY, x -> Math.abs(x - 5),
				Categoria.CYBERPUNK, x -> (int) Math.floor(x * 0.1),
				Categoria.THRILLER, x -> (int) Math.floor(x * 0.5),
				Categoria.STORICO, x -> x,
				Categoria.INFORMATICA, x -> x*2 + 10);
		
		return sconti.get(cat);
	}

}
