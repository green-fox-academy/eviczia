package com.greenfox.reddit.services;

//import com.greenfox.reddit.models.entities.UserRatedPost;

import com.greenfox.reddit.models.dtos.RatingInfo;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.models.entities.UserRating;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> listPosts() {
        return postRepository.findAll();
    }

    public void savePost(Post post, User user) {
        postRepository.save(post);
    }

    public void processRating(RatingInfo ratingInfo, User rater) {
        Post ratedPost = findById(ratingInfo.getPostId());
        Boolean likedIt = ratingInfo.getLikedIt();

        if (!ratedPost.getRaters().isEmpty()){ //if the list of rating are not empty, check who rated
            for (UserRating rating : ratedPost.getRaters()) {
                if (rating.getUserId().equals(rater.getId())) { // if rater exits in list
                    if (!rating.getLikedIt().equals(likedIt)) {//AND had DIFFERENT opinion
                        ratedPost.withdrawRating(ratedPost.getRaters().indexOf(rating), likedIt); //withdraw previous rating (resets score)
                        ratedPost.processNewRating(new UserRating(rater.getId(), ratedPost.getId(), likedIt), likedIt); //adds new rating (sets new sore)
                        postRepository.save(ratedPost);
                    } return;
                } break;
            } ratedPost.processNewRating(new UserRating(rater.getId(), ratedPost.getId(), likedIt), likedIt); // if rating list is not empty, but doesn't have this rating, add new rating(sets score)
        } else {
            ratedPost.processNewRating(new UserRating(rater.getId(), ratedPost.getId(), likedIt), likedIt); // if rating  list is empty, add new rating(sets score)
        } postRepository.save(ratedPost);
    }

    public Post findById(Long postId) {
        return postRepository.findById(postId).orElseGet(null);
    }

}

