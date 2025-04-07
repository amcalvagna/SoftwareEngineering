package debug;

import model.Album;
import model.Populate;
import model.Track;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Debug03 {
    public static Set<String> findLongTracks(List<Album> albums) {
        return albums.stream()//.parallel()
                .flatMap(Album::getTracks)
                .peek(s-> System.out.println("before filter: " + s))
                .filter(track -> track.getLength() > 300)
                .peek(s-> System.out.println("after filter: " + s))
                .map(Track::getName)
                .peek(s-> System.out.println("after map: " + s))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        findLongTracks(Populate.allAlbums).forEach(System.out::println);
    }
}
