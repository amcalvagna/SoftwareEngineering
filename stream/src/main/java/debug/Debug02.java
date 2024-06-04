package debug;

import model.Album;
import model.Populate;
import model.Track;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Debug02 {
    public static Set<String> findLongTracks(List<Album> albums) {
        return albums.stream()
                .flatMap(Album::getTracks)
                .filter(track -> {
                    System.out.println(track);
                    return track.getLength() > 300;
                })
                .map(Track::getName)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        findLongTracks(Populate.allAlbums).forEach(System.out::println);
    }}
