package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.services.PostService;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String listPosts(Model model, @RequestParam(value = "userId", required = false) Long id) {
        if (id == null) {
            return "redirect:/login";
        }
        model.addAttribute("posts", postService.listPosts());
        model.addAttribute("user", userService.findById(id));
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(String userName) {
        Long id = userService.getIdIfExits(userName);
        if (id == null) {
        userService.addUserIfNew(userName);
        id = userService.getIdIfExits(userName);

        }
        return "redirect:/?userId=" + id;
    }

    @GetMapping(value = "/add")
    public String renderSubmitForm(Model model, @RequestParam(value = "userId", required = false) Long id) {
        model.addAttribute("post", new Post());
        model.addAttribute("userId", id);
        return "submit-page";
    }

    @PostMapping(value = "/add")
    public String addNewPost(@ModelAttribute Post post, @RequestParam(value = "userId", required = false) Long id) {
        postService.save(post);
        return "redirect:/?userId=" + id;
    }


}
