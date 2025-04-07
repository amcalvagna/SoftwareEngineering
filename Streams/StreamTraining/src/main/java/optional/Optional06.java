package optional;

import model.Track;

import java.util.Optional;

public class Optional06 {
    public static Optional<Track> getTrack(String trackName) {
        return Optional.empty(); //simil null object pattern
    }

    public static void main(String[] args) {
        Optional<Track> nullTrack = getTrack("some name");

        String trackLength = nullTrack
                .map(track -> String.valueOf(track.getLength()))
                .orElse("Not found");

        System.out.println(trackLength);
    }
}
