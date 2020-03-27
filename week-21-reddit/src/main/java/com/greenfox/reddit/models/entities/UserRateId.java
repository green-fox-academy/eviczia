package com.greenfox.reddit.models.entities;


import java.io.Serializable;

public class UserRateId implements Serializable {

    private Long userId;
    private Long postId;

    public UserRateId() {
    }

    public UserRateId(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
