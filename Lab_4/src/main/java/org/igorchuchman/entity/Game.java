package org.igorchuchman.entity;

public class Game {
    private String gameName;
    private String genre;
    private int countComments;


    public Game() {
    }

    public Game(String gameName, String genre, int countComments) {
        this.gameName = gameName;
        this.genre = genre;
        this.countComments = countComments;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }
}
