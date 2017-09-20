package uy.edu.ort.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class User extends EntityClass {

    @Column
    private String name;
    @Column
    private String code;

    public User() {
    }

    public User(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Code  : " + code + "\nName : " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof User && Objects.equals(code, ((User) obj).code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
