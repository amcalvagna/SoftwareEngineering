package refactor;

import model.Album;
import model.Populate;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Refactor05 {
    public static Set<String> findLongTracks(List<Album> albums) {
        return albums.stream()
                .flatMap(album -> album.getTracks())
                .filter(track -> track.getLength() > 300)
                .map(track -> track.getName())
                .collect(toSet());
    }

    public static void main(String[] args) {
        Set<String> longTracks = findLongTracks(Populate.allAlbums);

        for (String trackName : longTracks) {
            System.out.println(trackName);
        }
    }
}
