package com.greenfox.reddit.services;

//import com.greenfox.reddit.models.entities.UserRatedPost;

import com.greenfox.reddit.models.dtos.PostRater;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

//import com.greenfox.reddit.repositories.UserRatedPostRepository;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Iterable<Post> listPosts() {
        return postRepository.findAll();
    }

    public void save(Post post) {
        postRepository.save(post);
    }

    public void processRating (PostRater postRater) {
        Optional<Post> optRatedPost = postRepository.findById(postRater.getPostId());
        if (optRatedPost.isPresent()) {
            Post ratedPost = optRatedPost.get();
            Integer oldScore = ratedPost.getScore();
            HashMap<Long, Boolean> thisPostsRatings = ratedPost.getRaters();
            if (!thisPostsRatings.containsKey(postRater.getUserId())) {
                //new
                ratedPost.setScore(oldScore + (postRater.getLikedIt() ? 1 : -1));
                thisPostsRatings.put(postRater.getUserId(), postRater.getLikedIt());
            } else {
                // edit
                if (thisPostsRatings.get(postRater.getUserId()) != postRater.getLikedIt()) {
                    ratedPost.setScore(oldScore + (postRater.getLikedIt() ? 2 : -2));
                }
            }
        }
    }

    private void setNewRating(PostRater postRater) {
    }

    private void editRating(PostRater postRater) {
    }
}
