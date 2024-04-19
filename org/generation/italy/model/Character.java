/*CHARACTER
- String name
- Lista move
- int hp

MOVE
- String name
- int power

MOVEREPOSITORY(2 move: atk e heal)
- Random random

USERINTERFACE
- Stampa del menu

START
- Inizio del game

OBBIETTIVO
Creare un programma dove siamo noi a combattere contro AI 1vs 1
Perde chi finisce la vita per primo
Definire la potenza della mossa(fissa)
Numero random per colpire 1/3
Curare 1/2
Applicare il principio di responsabilitÃ*/

package org.generation.italy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character {
    private String name;
    private List<Move> moves;
    private int hp;

    public Character(String name){
        this.name = name;
        this.moves = new ArrayList<>();
        this.hp = 100;
    }

    public String getName(){
        return name;
    }

    public List<Move> getMoves(){
        return moves;
    }

    public int getHp(){
        return hp;
    }

    public boolean isHit(Character c2){
        Random random = new Random();
        double percentage = random.nextInt(3);
        if(percentage == 1){
            c2.hp -= 15;
            return true;
        }
        return false; 
    }
  
}
