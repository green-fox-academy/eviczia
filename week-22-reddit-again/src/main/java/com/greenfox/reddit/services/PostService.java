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

    public void savePostAndProcessRating(Post post, Long userId) {
        post.addNewRater(userId, true);
        postRepository.save(post);
    }

    public void processRating (PostRater postRater) {
        Optional<Post> optRatedPost = postRepository.findById(postRater.getPostId());
        if (optRatedPost.isPresent()) {
            optRatedPost.orElseGet(null);
            Post ratedPost = optRatedPost.get();
            HashMap<Long, Boolean> thisUsersRating = ratedPost.getRaters();
//if this post has been rated by this user before
            if (thisUsersRating.containsKey(postRater.getUserId())) {
                // edit, only if new rating differs
                if (!thisUsersRating.get(postRater.getUserId()).equals(postRater.getLikedIt())) {
                    //withdraw previous
                    ratedPost.withdrawRater(postRater.getUserId(), postRater.getLikedIt());
                    ratedPost.addNewRater(postRater.getUserId(), postRater.getLikedIt());
                }
            } else {
                //set new
                ratedPost.addNewRater(postRater.getUserId(), postRater.getLikedIt());
            }
            postRepository.save(ratedPost);
        }
    }


    private void setNewRating(PostRater postRater) {
    }

    private void editRating(PostRater postRater) {
    }
}
