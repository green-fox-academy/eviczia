package com.greenfox.reddit.models.dtos;

public class RatingInfo {

   private Long postId;
    private Boolean likedIt;

    public RatingInfo() {
    }

    public RatingInfo(Long postId, Boolean likedIt) {
        this.postId = postId;
        this.likedIt = likedIt;
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
