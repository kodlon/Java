package Lab1;

import java.util.Objects;

public class User {
    private String lastName, email; //створення полів
    private String firstName;
    private int age;

    public User(String firstName) { //при створенні об'єкта потрібно буде відразу задати firstName
        this.firstName = firstName;
    }

    //Alt+Insert -> Getter and Setter

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() { //для виводу значення LastName
        return lastName;
    }

    public void setLastname(String lastname) { //для призначення значення LastName
        this.lastName = lastname;
    }

    public String getEmail() { //те саме
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Alt+Insert -> Equals and HashCode = перевизначення методів
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age);
    }
}
