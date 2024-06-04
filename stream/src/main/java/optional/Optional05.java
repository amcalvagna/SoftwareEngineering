package optional;

import model.Track;

import java.util.Optional;

public class Optional05 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Optional<Track> nullTrack = Optional.ofNullable(getTrack("some name"));

        String trackLength = nullTrack
                .map(track -> String.valueOf(track.getLength()))
                .orElse("Not found");

        System.out.println(trackLength);
    }
}
