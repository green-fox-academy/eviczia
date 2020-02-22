package com.greenfox.gfa.controllers;

import com.greenfox.gfa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

    private StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String gfaHome() {
        return "index";
    }

    @GetMapping("/gfa/list")
    public String listNames(Model model) {
        model.addAttribute("names", studentService.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String addStudentForm() {
        return "add";
    }
    @PostMapping("/gfa/save")
    public String addStudent(@ModelAttribute(value = "name") String name) {
        studentService.save(name);

        return "redirect:/gfa/list";
    }
}
