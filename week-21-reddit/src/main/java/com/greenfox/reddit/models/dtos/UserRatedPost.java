package com.greenfox.reddit.models.dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserRatedPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long[] userXPost;
    private Boolean likedIt;

    public UserRatedPost() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserRatedPost(Long[] userXPost) {
        this.userXPost = new Long[2];
    }

    public Long[] getUserXPost() {
        return userXPost;
    }

    public void setUserXPost(Long[] userXPost) {
        this.userXPost = userXPost;
    }

    public Boolean getLikedIt() {
        return likedIt;
    }

    public void setLikedIt(Boolean likedIt) {
        this.likedIt = likedIt;
    }
}
