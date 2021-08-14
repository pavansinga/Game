package com.play.game.domain;

public class GameMode {

    private String mode;
    private String level;
    private int boardSize;

    public String getMode() {
        return mode;
    }

    public String getLevel() {
        return level;
    }

    public int getBoardSize() {
        return boardSize;
    }

    private GameMode(){};

    private GameMode(String mode, String level, int boardSize) {
        this.mode = mode;
        this.level = level;
        this.boardSize = boardSize;
    }

    public static class Builder{
        private String mode;
        private String level;
        private int boardSize;


        public Builder setMode(String mode){
            this.mode = mode;
            return this;
        }

        public Builder setLevel(String level){
            this.level = level;
            return this;
        }
        public Builder setBoardSize(int boardSize){
            this.boardSize = boardSize;
            return this;
        }

        public GameMode build(){
            return new GameMode(mode,level,boardSize);
        }

    }

}
