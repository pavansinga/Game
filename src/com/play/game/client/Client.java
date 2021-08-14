package com.play.game.client;

import com.play.game.builder.GameFactory;
import com.play.game.domain.GameMode;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String player = null;
        String level = null;
        String game = null;
        int boardSize;
        System.out.println("Select Game"
                + '\n' +"TicTacToe"
                + '\n' +"Chess"
                + '\n' +"<ad> Life(Coming soon)" + '\n');
        Scanner inSel = new Scanner(System.in);
        game = inSel.nextLine().trim();

        System.out.println("Select Player"
                + '\n' +"Single"
                + '\n' +"Multi"
                + '\n' +"Bot" + '\n');
        Scanner inPlayer = new Scanner(System.in);
        player = inPlayer.nextLine().trim();

        System.out.println("Enter Board Size..."+ '\n');
        Scanner inSize = new Scanner(System.in);
        boardSize = Integer.parseInt(inSize.nextLine());

        System.out.println("Select Level"
                + '\n' +"Easy"
                + '\n' +"Medium"
                + '\n' +"Hard" + '\n');
        Scanner inLevel = new Scanner(System.in);
        level = inLevel.nextLine().trim();

        GameMode gameMode= new GameMode.Builder()
                .setLevel(level)
                .setBoardSize(boardSize)
                .setMode(player)
                .build();
       try {
           GameFactory.getGame(game).play(gameMode);
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }
}
