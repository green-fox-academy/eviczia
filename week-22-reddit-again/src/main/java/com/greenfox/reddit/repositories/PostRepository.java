package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.entities.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {




}
