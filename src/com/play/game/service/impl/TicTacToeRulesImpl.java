package com.play.game.service.impl;

import com.play.game.domain.Board;
import com.play.game.service.Rules;

import java.util.Random;

public class TicTacToeRulesImpl implements Rules {
   public Boolean checkMove(Board board){
        System.out.println("Moved has been evaluated");
       return Boolean.TRUE;
    }
    public void botTurn(Board board){
        System.out.println("Bot made a move");
    }
    public Boolean checkWinner(Board board){
       System.out.println("Checking Winner!!");
        Random rd = new Random();
       return rd.nextBoolean();
    }
}
