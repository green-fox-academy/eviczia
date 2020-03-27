package com.greenfox.reddit.services;

import com.greenfox.reddit.models.dtos.RatingInfo;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.models.entities.UserRating;
import com.greenfox.reddit.repositories.UserRatingRepository;
import com.greenfox.reddit.repositories.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRatingService {

    private UserRatingRepository userRatingRepository;
    private UserService userService;
    private PostService postService;

    @Autowired
    public UserRatingService(UserRatingRepository userRatingRepository, UserService userService, PostService postService) {
        this.userRatingRepository = userRatingRepository;
        this.userService = userService;
        this.postService = postService;
    }

    public void processRating(RatingInfo ratingInfo) {
        Post ratedPost = postService.findById(ratingInfo.getPostId();
        User rater = userService.findById(ratingInfo.getUserId());
        Boolean likedIt = ratingInfo.getLikedIt();
        UserRating userRating = new UserRating(rater, ratedPost, likedIt);



        if (ratedPost.getRaters())
        Optional<Post> ratedPost = postService.findById(postId);
        if (ratedPost.isPresent()) {
            UserRating userRating = new UserRating()
            ratedPost.get().getRaters().contains()
            if (!userRatedPostRepository.findById(userRatedPost.getId()).isPresent()) {
                ratedPost.get().setNewRating(newRating);
                userRatedPostRepository.save(userRatedPost);
            } else {
                Boolean formerRating = userRatedPostRepository.findById(userRatedPost.getId()).get().getLikedIt();
                ratedPost.get().editRating(formerRating, newRating);
            }
        }

    }

}
