package com.greenfox.gfa.controllers;

import com.greenfox.gfa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

    private StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String gfaHome() {
        return "main";
    }

    @GetMapping("/gfa/list")
    public String listNames(Model model) {
        model.addAttribute("names", studentService.findAll());

        return "list";
    }
}
