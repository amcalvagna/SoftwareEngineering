package optional;

import model.Track;

import java.util.Optional;

public class Optional04 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Optional<Track> nullTrack = Optional.ofNullable(getTrack("some name"));

        if (nullTrack.isPresent()) {
            System.out.println(nullTrack.get().getLength());
        } else {
            System.out.println("Not found");
        }
    }
}
