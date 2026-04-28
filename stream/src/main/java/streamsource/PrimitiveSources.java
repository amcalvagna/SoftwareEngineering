package streamsource;


import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveSources {
    public static void main(String[] args) {
        System.out.println("Stream builder");
        Stream<String> bands = Stream.<String>builder()
                .add("Metallica")
                .add("Pantera")
                .add("Korn")
                .add("Slipknot")
                .build();

        bands.forEach(System.out::println);

        System.out.println("Infinite list of numbers");
        Stream.iterate(2L, n-> n+1)  //base + induzione
                .filter(n-> n% 2 == 1)
                .limit(10)
                .forEach(System.out::println);
        
        //nota che ho bisogno di un istanza Random per generare numeri casuali,
        // non posso usare direttamente Random::nextInt
        // perchè il metodo ha bisogno dello stato corrente di un oggetto Random per funzionare 
        // (crea una sequenza di numeri casuali a partire da un seme iniziale)
        System.out.println("List of random numbers");
        Stream.generate(new Random()::nextInt) //  chiamata a creatore
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Old school exlusive");
        for (int i = 1; i < 4; i++){
            System.out.println(i);
        }

        System.out.println("New school exlusive");
        IntStream.range(1, 4).forEach(System.out::println);

        System.out.println("Old school inclusive");
        for (int i = 1; i <= 4; i++){
            System.out.println(i);
        }

        System.out.println("New school inclusive");
        IntStream.rangeClosed(1, 4).forEach(System.out::println);
    
 
    }
}
