package org.generation.italy.model;

import java.util.Random;

public class Game {
    private Player player;
    private MoveRepository moveRepo;
    private Move move;


    public boolean attack(Player p2, Move move){
        Random random = new Random();
        int percentage = random.nextInt(3);
        int hp; 
        if(percentage == 1){
            hp = p2.getHp() - move.getPower();
            p2.setHp(hp);
            return true;
        } 
        return false;

    }


    
}
