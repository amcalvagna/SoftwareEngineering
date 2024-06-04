package optional;

import model.Track;

public class Optional02 {
    public static Track getTrack(String trackName) {
        return null;
    }

    public static void main(String[] args) {
        Track nullTrack = getTrack("some name");

        try {
            System.out.println(nullTrack.getLength());
        } catch (NullPointerException e) {
            System.out.println("Not found");
        }
    }
}
