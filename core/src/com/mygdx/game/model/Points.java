package com.mygdx.game.model;
import java.io.Serializable;


public class Points implements Comparable <Points>, Serializable {
    private Integer points;
    private String playerName;

    public Points() {
        points = 0;
        playerName = "Mysterious player";
    }

    @Override
    public int compareTo(Points second) {
        return points.compareTo(second.points) ;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void addBonusExit() {
        points += 100;
    }

    public void removePoint() {
        points -= 1;
    }

//    public int getPoints() {
//        return points;
//    }

    @Override
    public String toString() {
        return this.playerName + ":       " + points;
    }
}
