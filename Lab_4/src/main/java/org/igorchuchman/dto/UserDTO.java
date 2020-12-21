package org.igorchuchman.dto;

import java.time.LocalDate;

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birth;


    public UserDTO() {
    }

    public UserDTO(final Long id, final String firstName, final String lastName, final LocalDate birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
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
}
