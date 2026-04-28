package refactorexercise;

import model.Album;
import model.Artist;
import model.Populate;
import model.Track;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem {
    // Print all artist names in upper case
    public static void problem01() {
        List<String> upperCaseArtistNames = new ArrayList<>();

        for (Artist artist : Populate.allArtists) {
            String upperCaseName = artist.getName().toUpperCase();
            upperCaseArtistNames.add(upperCaseName);
        }

        System.out.println("** Upper case artist names **");
        upperCaseArtistNames.forEach(System.out::println);
    }

    // Print all artist names that are from the UK
    public static void problem02() {
        Set<String> ukArtists = new HashSet<>();

        for (Artist artist : Populate.allArtists) {
            if (artist.isFrom("UK")) {
                String artistName = artist.getName();
                ukArtists.add(artistName);
            }
        }

        System.out.println("** UK artist names **");
        ukArtists.forEach(System.out::println);
    }

    // Get all tracks with 'home' in their name and the albums they are on
    public static void problem03() {
        List<String> trackNamesWithHome = new ArrayList<>();

        for (Album album : Populate.allAlbums) {
            for (Track track : album.getTracksList()) {
                if (track.getName().toUpperCase().contains("HOME")) {
                    String albumTrack = album.getName() + ":" + track.getName();
                    trackNamesWithHome.add(albumTrack);
                }
            }
        }

        System.out.println("** Tracks on albums with 'home' in their name **");
        trackNamesWithHome.forEach(System.out::println);
    }

    public static void main(String[] args) {
        problem01();
        problem02();
        problem03();
    }
}
