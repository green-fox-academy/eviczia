package com.greenfox.reddit.models.entities;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;

import javax.persistence.*;

@Entity
public class UserRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User rater;
    @ManyToOne

    private Post ratedPost;
    private Boolean likedIt;

    public UserRating() {
    }

    public UserRating(User rater, Post ratedPost, Boolean likedIt) {
        this.rater = rater;
        this.ratedPost = ratedPost;
        this.likedIt = likedIt;
    }

    public Long getId() {
        return id;
    }

    public UserRating(User rater) {
        this.rater = rater;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getRater() {
        return rater;
    }

    public void setRater(User rater) {
        this.rater = rater;
    }

    public Post getRatedPost() {
        return ratedPost;
    }

    public void setRatedPost(Post ratedPost) {
        this.ratedPost = ratedPost;
    }

    public Boolean getLikedIt() {
        return likedIt;
    }

    public void setLikedIt(Boolean likedIt) {
        this.likedIt = likedIt;
    }
}
