package com.example.usersMessage.models;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;

    private String userName;
    private String userPassword;
    private String userEmail;

    public Users() {
    }

    public Users(String userName, String userPassword, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
