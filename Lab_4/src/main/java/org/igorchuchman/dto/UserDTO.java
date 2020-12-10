package org.igorchuchman.dto;

import org.igorchuchman.entity.Game;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private String firstName;
    private String lastName;
    private LocalDate birth;


    public UserDTO() {
    }

    public UserDTO(String firstName, String lastName, LocalDate birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
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
}
