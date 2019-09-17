package com.example.usersMessage.models;

import javax.persistence.*;

@Entity
public class Avatar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long avatarID;

    private String url;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users author;

    public Avatar() {
    }

    public Avatar(Users author) {
        this.url = "https://i.ibb.co/1n5YR7C/user.png";
        this.author = author;
    }

    public Long getAvatarID() {
        return avatarID;
    }

    public void setAvatarID(Long avatarID) {
        this.avatarID = avatarID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Users getAuthor() {
        return author;
    }

    public void setAuthor(Users author) {
        this.author = author;
    }
}
