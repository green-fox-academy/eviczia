package com.greenfox.reddit.models.entities;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;

import javax.persistence.*;

@Entity
@IdClass(UserRateId.class)
public class UserRating {

    @Id
    private Long userId;

    @Id
    private Long postId;

    private Boolean likedIt;

    public UserRating() {
    }

    public UserRating(Long userId, Long postId, Boolean likedIt) {
        this.userId = userId;
        this.postId = postId;
        this.likedIt = likedIt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Boolean getLikedIt() {
        return likedIt;
    }

    public void setLikedIt(Boolean likedIt) {
        this.likedIt = likedIt;
    }
}
