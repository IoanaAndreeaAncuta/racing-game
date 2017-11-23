package org.fasttrackit;

public class Race {


    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
