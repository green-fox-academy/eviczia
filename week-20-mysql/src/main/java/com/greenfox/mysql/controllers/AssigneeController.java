package com.greenfox.mysql.controllers;

import com.greenfox.mysql.models.Assignee;
import com.greenfox.mysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"", "/", "/list"})
    public String list(Model model) {

        model.addAttribute("assignees", assigneeService.findAll());

        return "list-assignees";
    }

    @GetMapping("/add")
    public String renderAddAssigneeForm(Model model) {
        model.addAttribute("assignee", new Assignee());

        return "add-assignee";
    }

    @PostMapping("/add")
    public String addNewAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assignees/list";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteAssignee(@PathVariable long id) {
        assigneeService.deleteById(id);
        return "redirect:/assignees/list";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderAsssigneeEditForm(@PathVariable long id, Model model) {
        model.addAttribute("assignee", assigneeService.getById(id));
        return "edit-assignee";
    }

    @PostMapping(path = "/{id}/edit")
    public String updateAssignee(@ModelAttribute Assignee assignee, @PathVariable long id) {

        assigneeService.save(assignee);
        return "redirect:/assignees/list";
    }

}
