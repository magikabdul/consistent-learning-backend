package com.cholewa.consistency.user.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Setter
@Getter
@Entity(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String firstName;
    private String lastName;
    private Date created;
    private boolean isParent;

    public User(String firstName, String lastName, boolean isParent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isParent = isParent;
        created = new Date();
    }
}
