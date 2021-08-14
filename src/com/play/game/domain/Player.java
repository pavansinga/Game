package com.play.game.domain;

public class Player {
    private String name;
    private int age;
    private String location;
    private GameMode gameMode;
    private Player(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.location = builder.getLocation();
        this.gameMode = builder.getGameMode();
    };

    public static class Builder{
        private String name;
        private int age;
        private String location;
        private GameMode gameMode;
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getLocation() {
            return location;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public GameMode getGameMode() {
            return gameMode;
        }

        public Builder setGameMode(GameMode gameMode) {
            this.gameMode = gameMode;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }
}
