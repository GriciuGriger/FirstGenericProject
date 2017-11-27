package com.danilo;


import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Sport> {

    private String leagueName;
    private ArrayList<Team<T>> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(Team<T> team) {
        if (teams.contains(team)) {
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void printTable(){
        Collections.sort(teams);
        for(int i=0; i<teams.size(); i++){
            System.out.println(i+1 + ". " + teams.get(i).getName() + " with ranking of " + teams.get(i).ranking() + ". Wins: " + teams.get(i).getWon()
           + " Ties: " + teams.get(i).getTied() + " Losses: " + teams.get(i).getLost());
        }
    }


}
