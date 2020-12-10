package org.igorchuchman.entity;

import java.time.LocalDate;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private LocalDate birth;

    private List<Game> userGameComment;


    public User() {
    }

    public User(String firstName, String lastName, LocalDate birth, List<Game> userComment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.userGameComment = userComment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public List<Game> getUserGameComment() {
        return userGameComment;
    }

    public void setUserGameComment(List<Game> userGameComment) {
        this.userGameComment = userGameComment;
    }
}
