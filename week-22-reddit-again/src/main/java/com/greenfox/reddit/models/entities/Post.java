package com.greenfox.reddit.models.entities;

import javax.persistence.*;
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

    public Post(Integer score, String title, String link) {
        this.score = score;
        this.title = title;
        this.link = link;
    }

    public Post() {
        score = 0;
        title = "new post";
        link = String.format("%s%d", "localhost:8080/edit/", id);
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

    public void setScore(Integer score) {
        this.score = score;
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

    public void setNewRating(Boolean likedIt) {
        score = likedIt ? score++ : score--;
    }

    public void editRating(Boolean likedItThen, Boolean likesItNow) {
        if (likedItThen != likesItNow) {
            score = score + (likedItThen ? -2 : 2);
        }
    }
}
