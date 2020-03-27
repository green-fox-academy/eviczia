package com.greenfox.reddit;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public RedditApplication(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post());
        postRepository.save(new Post("Greenfox", "https://www.greenfoxacademy.com/" ));
        userRepository.save(new User("Eszter"));
    }
}
