package com.greenfox.reddit.models.dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserRatedPost {

    @Id
    private String id;
    private Long[] userXPost;
    private Boolean likedIt;

    public UserRatedPost() {
    }

    public UserRatedPost(Long[] userXPost) {
        this.userXPost = userXPost;
        setId();
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = String.format("U%dP%d", userXPost[0], userXPost[1]);
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
