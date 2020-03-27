package com.greenfox.reddit.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer score;
    private String title;
    private String link;
    @OneToMany(cascade = CascadeType.ALL)
    private List<UserRating> raters;


    public Post(String title, String link) {
        this.score = 0;
        this.title = title;
        this.link = link;
        raters = new ArrayList<>();
    }

    public Post() {
        score = 0;
        raters = new ArrayList<>();
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

    public List<UserRating> getRaters() {
        return raters;
    }

    public void setRaters(List<UserRating> raters) {
        this.raters = raters;
    }

    public void setScore(Boolean userLikesItNow) {
        score = score + (userLikesItNow ? 1 : -1);
    }

/*    public void addNewRater(User newRater, Boolean userLikesItNow) {
        raters.add(new UserRating(newRater, userLikesItNow));
        setScore(userLikesItNow);
    }*/

    /*    public void setNewRating(Boolean likedIt) {
        score = likedIt ? score++ : score--;
    }

    public void editRating(Boolean likedItThen, Boolean likesItNow) {
        if (likedItThen != likesItNow) {
            score = score + (likedItThen ? -2 : 2);
        }
    }*/
}