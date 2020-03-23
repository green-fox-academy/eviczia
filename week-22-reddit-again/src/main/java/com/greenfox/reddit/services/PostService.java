package com.greenfox.reddit.services;

//import com.greenfox.reddit.models.entities.UserRatedPost;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

/*    public void processRating (UserRatedPost userRatedPost) {
        Boolean newRating = userRatedPost.getLikedIt();
        Optional<Post> ratedPost = postRepository.findById(userRatedPost.getUserXPost()[1]);
        if (ratedPost.isPresent()) {
            if (!userRatedPostRepository.findById(userRatedPost.getId()).isPresent()) {
                ratedPost.get().setNewRating(newRating);
                userRatedPostRepository.save(userRatedPost);
            } else {
                Boolean formerRating = userRatedPostRepository.findById(userRatedPost.getId()).get().getLikedIt();
                ratedPost.get().editRating(formerRating, newRating);
            }
        }
    }*/
}
