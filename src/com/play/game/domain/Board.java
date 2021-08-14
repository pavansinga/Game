package com.play.game.domain;

import com.play.game.service.State;

import java.util.List;

public class Board {
    private State state;
    private String colour;
    private int boardSize;
    private List<Symbols> symbols;

    public State getState() {
        return state;
    }

    public String getColour() {
        return colour;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public List<Symbols> getSymbols() {
        return symbols;
    }

    public Board(Builder builder){
        this.state=builder.getState();
        this.colour=builder.getColour();
        this.boardSize=builder.getBoardSize();
        this.symbols = builder.getSymbols();
    }
    public static class Builder{
        private State state;
        private String colour;
        private int boardSize;
        private List<Symbols> symbols;

        public State getState() {
            return state;
        }

        public Builder setState(State state) {
            this.state = state;
            return this;
        }

        public String getColour() {
            return colour;
        }

        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public int getBoardSize() {
            return boardSize;
        }

        public Builder setBoardSize(int boardSize) {
            this.boardSize = boardSize;
            return this;
        }

        public List<Symbols> getSymbols() {
            return symbols;
        }

        public Builder setSymbols(List<Symbols> symbols) {
            this.symbols = symbols;
            return this;
        }

        public Board build(){
            return new Board(this);
        }

    }
}
