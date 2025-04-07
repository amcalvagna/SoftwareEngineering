package model;

import java.util.List;
import java.util.stream.Stream;

public class Album {
    private String name;
    private List<Artist> musicians;
    private List<Track> tracks;

    public Album(String name, List<Artist> musicians, List<Track> tracks) {
        this.name = name;
        this.musicians = musicians;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getMusicians() {
        return musicians;
    }

    public List<Track> getTracksList() {
        return tracks;
    }

    public Stream<Track> getTracks() {
        return tracks.stream();
    }

    @Override
    public String toString() {
        return getName();
    }
}
