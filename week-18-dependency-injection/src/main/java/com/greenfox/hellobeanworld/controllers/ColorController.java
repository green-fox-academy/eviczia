package com.greenfox.hellobeanworld.controllers;

import com.greenfox.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

    private UtilityService utilityService;

    @Autowired
    public ColorController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String homePage() {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String displayBackground(Model model) {
        model.addAttribute("color", utilityService);

        return "colored";
    }


    @GetMapping("/useful/email")
    public String checkEmail(@RequestParam(value = "email", required = false) String email, Model model) {
        if (email == null) {
            return "message";
        }
        model.addAttribute("email", email);
        model.addAttribute("isValid", utilityService.emailValidator(email) ? "valid" : "inValid");
        model.addAttribute("result", utilityService.emailValidator(email) ? " is a valid email address" : " is not a valid email address");
        return "evaluate";
    }

    @GetMapping("/useful/encode")
    public String ceasarEncode(@RequestParam(value = "text", required = false) String text, Model model) {
        if (text == null) {
            return "code_message";
        }
        model.addAttribute("text", utilityService.caesar(text, 1));
        return "encode";
    }
    @GetMapping("/useful/decode")
    public String ceasarDecode(@RequestParam(value = "text", required = false) String text, Model model) {
        if (text == null) {
            return "code_message";
        }

        model.addAttribute("text", utilityService.caesar(text, -1));
        return "decode";
    }

}
