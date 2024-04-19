package org.generation.italy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoveRepository{
    private static List<Move> moves = new ArrayList<>();
    static {
        Move attackMove = new Move("Punch", 15, MoveType.ATTACK);
        Move healMove = new Move("Bendage", 10, MoveType.HEAL);
        moves.add(healMove);
        moves.add(attackMove);
    }
    

    public List<Move> getMoves(){
        return moves;
    }

}
