package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.dtos.RatingInfo;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//import com.greenfox.reddit.models.entities.UserRatedPost;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
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
        model.addAttribute("ratingInfo", new RatingInfo());
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(String userName) {
        Long id = userService.getIDByName(userName);
        if (id == null) {
            userService.addUserIfNew(userName);
            id = userService.getIDByName(userName);
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

    @PostMapping(value = "/rate/{userId}")
    public String processRating(@ModelAttribute RatingInfo ratingInfo, @PathVariable(name = "userId") Long userId) {
        postService.processRating(ratingInfo, userService.findById(userId));
        return String.format("redirect:/%d", userId);
    }

}
