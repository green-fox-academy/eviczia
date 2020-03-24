package com.greenfox.reddit.models.dtos;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PostRater {

    private Long userId;
    private Long postId;
    private Boolean likedIt;

    public PostRater() {
    }

    public PostRater(Long userId, Long postId, Boolean likedIt) {
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
