package org.fasttrackit;


public class App {
    public static void main(String[] args) {
        Race race = new Race();
        Track track = new Track();
        track.setLength(100);
        race.setTrack(track);

        race.start();



    }
}
