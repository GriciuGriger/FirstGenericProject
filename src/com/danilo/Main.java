package com.danilo;

import com.danilo.sports.Basketball;
import com.danilo.sports.Football;
import com.danilo.sports.Volleyball;

import javax.tools.FileObject;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        // ArrayList<com.danilo.Team> teams;
        // Collections.sort(teams);

        League<Football> premierLeague = new League<>("Premier League");

        Team<Football> manchesterUnited = new Team<>("Manchester United");
        Team<Football> liverpool = new Team<>("Liverpool FC");
        Team<Football> chelsea = new Team<>("Chelsea FC");
        Team<Football> westham = new Team<>("West Ham United");

        Team<Basketball> dallasmavericks = new Team<>("Dallas Mavericks");

        //premierLeague.addTeam(dallasmavericks);
        //won't work cause of bad team generic type parameter sent to a method

        premierLeague.addTeam(manchesterUnited);
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(westham);

        // 1st fixture
        manchesterUnited.matchResult(liverpool, 2, 1);
        westham.matchResult(chelsea, 0, 2);
        // 2nd fixture
        liverpool.matchResult(westham, 2, 1);
        chelsea.matchResult(manchesterUnited, 1, 0);
        // 3rd fixture
        westham.matchResult(manchesterUnited, 1, 1);
        liverpool.matchResult(chelsea, 2, 2);
        // 4th fixture
        liverpool.matchResult(manchesterUnited, 0, 0);
        chelsea.matchResult(westham, 3, 0);
        // 5th fixture
        westham.matchResult(liverpool, 0, 1);
        manchesterUnited.matchResult(chelsea, 2, 0);
        //6th fixture
        manchesterUnited.matchResult(westham, 1, 2);
        chelsea.matchResult(liverpool, 2, 3);

        premierLeague.printTable();
    }
}
