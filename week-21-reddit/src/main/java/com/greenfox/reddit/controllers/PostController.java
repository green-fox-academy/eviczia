package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.dtos.RatingInfo;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
//import com.greenfox.reddit.models.entities.UserRatedPost;
import com.greenfox.reddit.models.entities.UserRating;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserRatingService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;
    private UserRatingService userRatingService;

    @Autowired
    public PostController(PostService postService, UserService userService, UserRatingService userRatingService) {
        this.postService = postService;
        this.userService = userService;
        this.userRatingService = userRatingService;
    }

    @GetMapping(value = "/")
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.listPosts());
        return "main";
    }

    @GetMapping(path = "/{userId}")
    public String listPosts(Model model, @PathVariable(name = "userId") Long id) {
        model.addAttribute("posts", postService.listPosts());
        model.addAttribute("user", userService.findById(id));
        model.addAttribute("ratingInfo", new RatingInfo(id));
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(String name) {
        Long id = userService.getIDByName(name);
        if (id == null) {
            userService.addUser(new User(name));
            id = userService.getIDByName(name);
        }
        return String.format("redirect:/%d", id);
    }

    @GetMapping(value = "/add/{userId}")
    public String renderSubmitForm(Model model, @PathVariable(name = "userId") Long id) {
        model.addAttribute("post", new Post());
        model.addAttribute("userId", id);
        return "submit-page";
    }

    @PostMapping(value = "/add/{userId}")
    public String addNewPost(@ModelAttribute Post post, @PathVariable(name = "userId") Long id) {
        postService.savePost(post, userService.findById(id));
        return String.format("redirect:/%d", id);
    }

    @PostMapping(value = "/rate")
    public String processRating(@ModelAttribute RatingInfo ratingInfo) {
        userRatingService.processRating(ratingInfo);
        return String.format("redirect:/%d", ratingInfo.getUserId());
    }

}
