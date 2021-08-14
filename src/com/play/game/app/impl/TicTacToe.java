package com.play.game.app.impl;

import com.play.game.app.Game;
import com.play.game.builder.GameFactory;
import com.play.game.domain.Board;
import com.play.game.domain.GameMode;
import com.play.game.domain.Player;
import com.play.game.service.PlayerService;
import com.play.game.service.Rules;
import com.play.game.service.State;
import com.play.game.service.impl.StateImpl;
import com.play.game.service.impl.TicTacToeRulesImpl;

import java.util.List;
import java.util.Scanner;

public class TicTacToe implements Game {
    private Board board;
    private Rules rules;
    private List<Player> playerList;
    private PlayerService playerService;

    @Override
    public void play(GameMode mode){
      board = new Board.Builder()
              .setColour(random())
              .setBoardSize(mode.getBoardSize())
              .setState(new StateImpl())
              .build();
      Rules rules = new TicTacToeRulesImpl();
      while (!rules.checkWinner(board)){
          board.getState().updateState();
          if(rules.checkMove(board)){
              if("Bot".equals(mode.getMode())){
                  rules.botTurn(board);
                  continue;
              }
             playerService = GameFactory.getPlayerService();
              playerService.playerTurn(board);
          }
      }
    }

    private String random(){
        return "Blue";
    }
}
