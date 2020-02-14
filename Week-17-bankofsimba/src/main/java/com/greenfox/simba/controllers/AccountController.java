package com.greenfox.simba.controllers;

import com.greenfox.simba.models.Bank;
import com.greenfox.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/show")
    public String showAccount(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000, "lion");


        model.addAttribute("bankaccount", simba);

        return "index";
    }

    @GetMapping("/show-all")
    public String showAllAccounts(Model model) {

        Bank simbaBank = new Bank();

        simbaBank.fillList();

        model.addAttribute("bank", simbaBank.getThisBanksAccounts());

        return "show-accounts";
    }





}
