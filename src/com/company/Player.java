package com.company;

import java.util.Scanner;

//represents a player

public class Player {
    private Scanner console = new Scanner(System.in);
    private String name;
    private int ovr;    // this defines the players overall


//    public Player(String name,int ovr) {
//        this.name = name;
//        if(ovr >= 55 && ovr <= 99){
//            this.ovr = ovr;
//        }else{
//            throw new IllegalArgumentException("Ovr must be in-between 55-99");
//        }

//    }
    //constructs a player
    public Player(){
        this.name = setName();
        setOvr();
    }

//    //sets the players skill level
//    public void setOvr(int ovr) {
//        this.ovr = ovr;
//    }

    public int getOvr() {
        return ovr;
    }

    // gets the players name
    public String getName() {
        return this.name;
    }

    //sets the players name
    public String setName(){
        System.out.print("Enter player name: ");
        this.name = console.next();
        return name;
    }

    //sets the players overall.
    public int setOvr(){
        System.out.print("Enter " + this.getName() + "'s" + " Overall: ");
        this.ovr = console.nextInt();
        if(ovr < 55 || ovr > 99){
            throw new IllegalArgumentException("overall is not within range");
        }
        return ovr;
    }
}
