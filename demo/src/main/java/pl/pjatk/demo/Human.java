package pl.pjatk.demo;

import org.hibernate.annotations.*;
import org.springframework.boot.autoconfigure.domain.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.*;

@Entity
public class Human {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String secondName;

    Human(){}

    public Human(Long id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(id, human.id) &&
                Objects.equals(firstName, human.firstName) &&
                Objects.equals(secondName, human.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName);
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
