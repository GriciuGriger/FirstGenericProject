package com.danilo;

import com.danilo.sports.Basketball;

import java.util.ArrayList;

public class Team<T extends Sport> implements Comparable<Team<T>> {

    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        } else if (ourScore < theirScore){
            lost++;
        } else {
            tied++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }

    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
         if(this.ranking() > team.ranking()){
             return -1;
         } else if(this.ranking() < team.ranking()){
             return 1;
         } else {
             return 0;
         }
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }
}
