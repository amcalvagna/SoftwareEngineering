package model;

import java.util.Collections;
import java.util.List;
//import java.util.StringTokenizer;

public class Artist {
    private final String name;
    private final List<Artist> members;
    private final String nationality;

    public Artist(String name, String nationality) {
        this(name, Collections.<Artist>emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        this.name = name;
        this.members = members;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isSolo(){
        return members.isEmpty();
    }

    public boolean isFrom(String nationality){
        return this.nationality.equals(nationality);
    }

    @Override
    public String toString() {
        return getName();
    }
}
