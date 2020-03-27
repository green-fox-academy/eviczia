package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.entities.UserRating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRatingRepository extends CrudRepository<UserRating, Long> {
}
