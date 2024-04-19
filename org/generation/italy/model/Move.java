package org.generation.italy.model;

public class Move {
    private String name;
    private int power;
    private MoveType type;

    public Move(String name,int power, MoveType type){
        this.name = name;
        this.power = power;
        this.type = type;
    }

}
