package com.greenfox.reddit.models.entities;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer score;
    private String title;
    private String link;
    @OneToMany
    private List<User> users;
    private HashMap<Long, Boolean> raters;

    public Post(String title, String link) {
        score = 0;
        this.title = title;
        this.link = link;
        raters = new HashMap<>();
    }

    public Post() {
        score = 0;
        raters = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Boolean userLikesItNow) {
        score = score + (userLikesItNow ? 1 : -1);
    }

    public void addNewRater(Long userId, Boolean userLikesItNow) {
        raters.put(userId, userLikesItNow);
        setScore(userLikesItNow);
    }
    public void withdrawRater(Long userId, Boolean userLikesItNow) {
        raters.remove(userId, userLikesItNow);
        setScore(userLikesItNow);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public HashMap<Long, Boolean> getRaters() {
        return raters;
    }

    public void setRaters(HashMap<Long, Boolean> raters) {
        this.raters = raters;
    }

}
