package com.greenfox.reddit.controllers;

import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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




}
