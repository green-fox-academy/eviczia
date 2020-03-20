package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.dtos.UserRatedPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRatedPostRepository extends CrudRepository<UserRatedPost, String> {
}
