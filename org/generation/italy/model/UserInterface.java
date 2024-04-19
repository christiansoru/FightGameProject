package org.generation.italy.model;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Player user;
    private Player cpu;
    private MoveRepository moveRepo = new MoveRepository();

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao, come ti chiami?");
        String choiceName = scanner.nextLine();
        Player p = new Player(choiceName);
        System.out.println("-------------------\n\n Benvenuto in LOTTECLANDESTINE " + choiceName);
        System.out.println("Lista mosse: ");
        //List<Move> mosse = moveRepo.getMoves();
        for (Move move : moveRepo.getMoves()) {
            System.out.println(move);
        }
        System.out.println("");

    }
    
    
}
