package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postservice;

    @Autowired
    public PostController(PostService postservice) {
        this.postservice = postservice;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String listPosts(Model model) {
        model.addAttribute("posts", postservice.listPosts());
        return "main";
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
