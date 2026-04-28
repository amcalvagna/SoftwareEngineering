package optionalexercise;

import model.Track;

public class Problem {
    // Avoid NullPointerException
    public static void problem01(Track track){
        System.out.println(track.getName());
    }

    // Use Optional instead of if statement
    public static String problem02(Track track){
        if(track == null){
            return "NONE";
        }

        return track.getName().toUpperCase();
    }

    public static void main(String[] args) {
        problem01(null);
        problem02(null);
    }
}
