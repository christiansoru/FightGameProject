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

    public String toString() {
        return String.format("Move: %s, Power: %d, Tipo: %s ",name, power, type);
    }

    public int getPower(){
        return power;
    }
}
