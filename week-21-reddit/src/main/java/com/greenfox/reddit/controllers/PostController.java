package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.entities.Post;
import com.greenfox.reddit.models.entities.User;
//import com.greenfox.reddit.models.entities.UserRatedPost;
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
//        model.addAttribute("rater", new UserRatedPost(id));
        return "main";
    }

    @GetMapping("/login")
    public String renderLoginFrom(Model model) {
        model.addAttribute("newUser", new User());
        return "login";
    }

    @PostMapping("/login")
    public String sendLoginData(String name) {
        if (name.equals("")) {
            return "redirect:/login";
        }
        Long thisNamesId = userService.getIDByName(name);
        if (thisNamesId == null) {
            userService.addUser(new User(name));
            thisNamesId = userService.getIDByName(name);
        }
        return "redirect:/?userId=" + thisNamesId;
    }

    @GetMapping(value = "/add")
    public String renderSubmitForm(Model model, @RequestParam(value = "userId", required = false) Long id) {
        model.addAttribute("post", new Post());
        return "submit-page";
    }

    @PostMapping(value = "/add")
    public String addNewPost(@ModelAttribute Post post, @RequestParam(value = "userId", required = false) Long id) {
        postService.save(post);
        return "redirect:/?userId=" + id;
    }

/*    @PostMapping(value = "/rate")
    public String processRating(@ModelAttribute UserRatedPost userRatedPost) {

        return "redirect:/?userId=" + userRatedPost.getUserXPost()[0];
    }*/

}
