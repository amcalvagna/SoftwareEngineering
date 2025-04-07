package operations;

import model.Album;
import model.Populate;

import java.io.IOException;
//import java.util.stream.Stream;

public class mapping {  //come navigare un collezione di collezioni di T, come fosse una unica collection di T  
    public static void main(String[] args) throws IOException {
        Populate.allAlbums.stream()
                .map(Album::getTracks)
                .forEach(System.out::println);  //ogni elemento è una collection...
        // System.in.read();
        // Populate.allAlbums.stream()
        //        .map(Album::getTracks)
        //        .forEach(e-> e.forEach(System.out::println)); //ora ok
        // System.in.read();
        // Populate.allAlbums.stream()
        //        .flatMap(Album::getTracks)
        //        .forEach(System.out::println);    // ora l'ho proprio schiacciata
    }
}
