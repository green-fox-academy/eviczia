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

        for (UserRating rating : ratedPost.getRaters()) {
            if (!rating.getUserId().equals(rater.getId())) {
                ratedPost.getRaters().add(new UserRating(rater.getId(), ratedPost.getId(), likedIt));
            } else if (!rating.getLikedIt().equals(likedIt)) {
                rating.setLikedIt(likedIt);
                ratedPost.setScore(likedIt);
            }
            ratedPost.setScore(likedIt);
            postRepository.save(ratedPost);
        }
    }

    public Post findById(Long postId) {
        return postRepository.findById(postId).orElseGet(null);
    }

}

