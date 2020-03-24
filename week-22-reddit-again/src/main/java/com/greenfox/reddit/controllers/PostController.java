package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.dtos.PostRater;
import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("postrater", new PostRater());
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(String userName) {
        Long id = userService.getIdIfExits(userName);
        if (id == null) {
        userService.addUserIfNew(userName);
        id = userService.getIdIfExits(userName);

        }
        return String.format("redirect:/%d", id);
    }

    @GetMapping(value = "/add")
    public String renderSubmitForm(Model model, @RequestParam(value = "userId", required = false) Long id) {
        model.addAttribute("post", new Post());
        model.addAttribute("userId", id);
        return "submit-page";
    }

    @PostMapping(value = "/add")
    public String addNewPost(@ModelAttribute Post post, @PathVariable(name = "userId") Long id) {
        postService.save(post);
        return String.format("redirect:/%d", id);
    }

    @PostMapping(value = "/rate")
    public String processRating(@ModelAttribute PostRater postRater) {
        postService.processRating(postRater);

        return String.format("redirect:/%d", postRater.getUserId());
    }


}
