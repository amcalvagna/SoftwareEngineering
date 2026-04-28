package optionalexercise;

import model.Track;

import java.util.Optional;

public class Solution {
    // Avoid NullPointerException
    public static void problem01a(Track track){
        Optional<Track> trackOptional = Optional.ofNullable(track);
        trackOptional.ifPresent(track1 -> System.out.println(trackOptional.get().getName()));
    }

    public static void problem01b(Optional<Track> track){
        track.ifPresent(track1 -> System.out.println(track1.getName()));
    }

    // Use Optional instead of if statement
    public static String problem02(Track track){
        Optional<Track> trackOptional = Optional.ofNullable(track);

        return trackOptional
                .map(t -> t.getName().toUpperCase())
                .orElse("NONE");
    }

    public static void main(String[] args) {
        problem01a(null);
        problem01b(Optional.empty());
        problem02(null);
    }}
   