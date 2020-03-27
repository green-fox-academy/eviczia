package com.greenfox.reddit.services;

//import com.greenfox.reddit.models.entities.UserRatedPost;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.models.entities.UserRating;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostService {

    private PostRepository postRepository;
    private UserRatingService userRatingService;

    @Autowired
    public PostService(PostRepository postRepository, UserRatingService userRatingService) {
        this.postRepository = postRepository;
        this.userRatingService = userRatingService;
    }

    public Iterable<Post> listPosts() {
        return postRepository.findAll();
    }

    public void savePost(Post post, User user) {
        post.addNewRater(user, true);
        postRepository.save(post);
    }

    public void processRating(User user, Long postId, Boolean likedIt) {
        Optional<Post> ratedPost = postRepository.findById(postId);
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

    public Post findById(Long postId) {
            return postRepository.findById(postId).orElseGet(null);
        }

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
