package refactorexercise;

import model.Artist;
import model.Populate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    // Print all artist names in upper case
    public static void problem01() {
        List<String> upperCaseArtistNames = Populate.allArtists.stream()
                .map(artist -> artist.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("** Upper case artist names **");
        upperCaseArtistNames.forEach(System.out::println);
    }

    // Print all artist names that are from the UK
    public static void problem02() {
        Set<String> ukArtists = Populate.allArtists.stream()
                .filter(artist -> artist.isFrom("UK"))
                .map(Artist::getName)
                .collect(Collectors.toSet());

        System.out.println("** UK artist names **");
        ukArtists.forEach(System.out::println);
    }
    // Get all tracks with 'home' in their name and the albums they are on
    public static void problem03() {
        List<String> trackNamesWithHome = Populate.allAlbums.stream()
                .flatMap(album ->
                        album.getTracks()
                                .map(track -> new Object() {
                                    String albumName = album.getName();
                                    String trackName = track.getName();
                                }))
                .filter(albumTrack -> albumTrack.trackName.toUpperCase().contains("HOME"))
                .map(albumTrack -> albumTrack.albumName + ":" + albumTrack.trackName)
                .collect(Collectors.toList());

        System.out.println("** Tracks on albums with 'home' in their name **");
        trackNamesWithHome.forEach(System.out::println);
    }

    public static void main(String[] args) {
        problem01();
        problem02();
        problem03();
    }
}
