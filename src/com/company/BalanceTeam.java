package com.company;

import com.company.Player;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BalanceTeam {

    private int numTeams;
    private int numPlayers;
    private Set<Player> playerContainer;

    public BalanceTeam(int numTeams, int numPlayers) {
        if(numTeams >= 2 && numPlayers >= 3){
        this.numTeams = numTeams;
        this.numPlayers = numPlayers;
        playerContainer = new HashSet<>();
        for(int i = 0; i < numPlayers; i++){
            playerContainer.add(new Player());
        }
        }else{
            throw new IllegalArgumentException();
        }
    }

}
