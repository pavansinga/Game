package com.play.game.builder;

import com.play.game.app.Game;
import com.play.game.app.impl.TicTacToe;
import com.play.game.domain.GameMode;
import com.play.game.service.PlayerService;
import com.play.game.service.impl.PlayerServiceImpl;

public class GameFactory {
    private static TicTacToe ticTacToe;
    private static PlayerService playerService;

    public static Game getGame(String game){
    if("TicTacToe".equals(game)){
        synchronized (GameFactory.class) {
            if (ticTacToe == null) {
                ticTacToe = new TicTacToe();
            }
            return ticTacToe;
        }
    }else if("Chess".equals(game)){
        //To-do chess impl (Future scope)
        return null;
    }
    throw new IllegalArgumentException("No Game Found!!");
    }

    public static PlayerService getPlayerService(){
        synchronized (GameFactory.class) {
            if (playerService == null) {
                playerService = new PlayerServiceImpl();
            }
            return playerService;
        }
    }

}
