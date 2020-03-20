package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.models.entities.UserRatedPost;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    private PostService postservice;

    @Autowired
    public PostController(PostService postservice) {
        this.postservice = postservice;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String listPosts(Model model, @RequestParam(value = "userId", required = false) Long id) {
        if (id == null) {
            return "redirect:/login";
        }
        model.addAttribute("posts", postservice.listPosts());
        model.addAttribute("rater", new UserRatedPost());
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom(Model model) {
        model.addAttribute("newuser", new User());
        return "login";
    }


    @GetMapping(value = "/add")
    public String renderSubmitForm(Model model) {
        model.addAttribute("post", new Post());
        return "submit-page";
    }

    @PostMapping(value = "/add")
    public String addNewPost(@ModelAttribute Post post) {
        postservice.save(post);
        return "redirect:/";
    }

}
