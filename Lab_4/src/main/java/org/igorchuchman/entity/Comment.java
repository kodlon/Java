package org.igorchuchman.entity;

import java.time.LocalDate;

public class Comment {
    private Long id;
    private String userName;
    private String gameName;
    private LocalDate generatedDate;
    private int rating;
    private String comment;

    public Comment() {
    }

    public Comment(Long id, String userName, String gameName, LocalDate generatedDate, int rating, String comment) {
        this.id = id;
        this.userName = userName;
        this.gameName = gameName;
        this.generatedDate = generatedDate;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
