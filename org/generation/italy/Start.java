package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Game;
import org.generation.italy.model.MoveRepository;
import org.generation.italy.model.Player;
import org.generation.italy.model.UserInterface;


public class Start {
    public static void main(String[] args) {
        UserInterface u = new UserInterface();
        u.menu();
        Game game = new Game();
        MoveRepository moveRepo = new MoveRepository();
        do{
            if(game.attack(p, moveRepo.getMoves().get(1))){
                System.out.println("Colpito!");
                System.out.println("hp del tuo avversario aggiornati: " + p.getHp());
            }else{
                System.out.println("Hai lisciato!");
            }
                
            
        }while(p.getHp() > 0);
    }
}
