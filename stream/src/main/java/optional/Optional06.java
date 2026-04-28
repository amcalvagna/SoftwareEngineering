package optional;
import model.Populate;
import model.Track;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Optional06 {
    public static Optional<Track> getTrack(String trackName) {
        List<Track> tracks = Populate.allTracks;
        return tracks.stream().filter(x->x.getName().equals(trackName)).findAny();
        //return Optional.empty();    // null object pattern
    }

    public static void main(String[] args) {      
        //String trackLength = getTrack("some name")
        String trackLength = getTrack("Hey Joe")
                .map(track -> String.valueOf(track.getLength()))
                .orElse("Not found");
        System.out.println(trackLength);
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        List<Track> tracks = Populate.allTracks;

        Stream.<String>generate(() -> input.nextLine())
                .takeWhile(name -> !name.isEmpty())
                .map(name -> tracks.stream()
                                    .filter(t->t.getName().equals(name))
                                    .findAny()) 
                .forEach(o -> o.ifPresentOrElse(
                                    t->System.out.println(t.getLength()), 
                                    ()->System.out.println("Not found"))
                        );
        input.close();
    }
}
