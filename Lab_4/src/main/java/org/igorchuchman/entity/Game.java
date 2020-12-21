package org.igorchuchman.entity;

public class Game {
    private  Long id;
    private String gameName;
    private String genre;
    private int countComments;


    public Game() {
    }

    public Game(Long id, String gameName, String genre, int countComments) {
        this.id = id;
        this.gameName = gameName;
        this.genre = genre;
        this.countComments = countComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
