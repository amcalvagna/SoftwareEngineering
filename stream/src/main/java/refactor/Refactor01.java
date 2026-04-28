package refactor;

import model.Album;
import model.Populate;
import model.Track;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Refactor01 {
    public static Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();

        for (Album album : albums) {
            for (Track track : album.getTracksList()) {
                if (track.getLength() > 300) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }

        return trackNames;
    }

    public static void main(String[] args) {
        Set<String> longTracks = findLongTracks(Populate.allAlbums);

        for (String trackName : longTracks) {
            System.out.println(trackName);
        }
    }
}
