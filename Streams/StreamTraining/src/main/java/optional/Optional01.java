package optional;

import model.Track;

public class Optional01 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Track nullTrack = getTrack("some name");

        System.out.println(nullTrack.getLength());
    }
}
