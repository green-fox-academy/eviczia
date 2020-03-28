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
        postRepository.save(new Post("Greenfox", "https://www.greenfoxacademy.com/" ));
        postRepository.save(new Post("My Little Reddit Code on GitHub", "https://github.com/green-fox-academy/eviczia/tree/master/week-22-reddit-again"));
        postRepository.save(new Post("Johns Hopkins Coronavirus COVID-19 Global Cases", "https://coronavirus.jhu.edu/map.html" ));
        postRepository.save(new Post("WAVE accessibility tool", "https://wave.webaim.org/"));
        postRepository.save(new Post("Johns Hopkins Coronavirus COVID-19 Global Cases", "https://coronavirus.jhu.edu/map.html" ));
        postRepository.save(new Post("HTML 5 Test", "http://html5test.com/index.html" ));
        postRepository.save(new Post("Duolingo", "https://www.duolingo.com/learn" ));
        postRepository.save(new Post("Wait But Why", "https://waitbutwhy.com/" ));
        postRepository.save(new Post("HackerRank", "https://www.hackerrank.com/" ));
        postRepository.save(new Post("Strava", "https://www.strava.com/" ));
        postRepository.save(new Post("HTTP Cats", "https://http.cat/" ));
        userRepository.save(new User("Eszter"));
    }
}
