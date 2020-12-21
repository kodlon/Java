package org.igorchuchman.entity;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birth;

    private List<Game> userGameComment;


    public User() {
    }

    public User(final Long id, String firstName, String lastName, LocalDate birth, List<Game> userComment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.userGameComment = userComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
