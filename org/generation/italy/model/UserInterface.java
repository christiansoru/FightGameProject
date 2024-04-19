package org.generation.italy.model;

import java.util.List;

public class UserInterface {
    private Character user;
    private Character cpu;
    private MoveRepository moveRepo = new MoveRepository();

    public void menu(){
        System.out.println("Lista mosse");
        //List<Move> mosse = moveRepo.getMoves();
        for (Move move : moveRepo.getMoves()) {
            System.out.println(move);
        }
    }
    
    
}
