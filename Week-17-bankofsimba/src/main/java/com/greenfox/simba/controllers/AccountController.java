package com.greenfox.simba.controllers;

import com.greenfox.simba.models.Bank;
import com.greenfox.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {
    private Bank simbaBank;

    public AccountController() {
        simbaBank = new Bank();
        simbaBank.fillList();
    }

    @GetMapping("/show")
    public String showAccount(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000, "lion");

        model.addAttribute("bankaccount", simba);
        return "index";
    }

    @GetMapping("/show-all")
    public String showAllAccounts(Model model) {

        model.addAttribute("bank", simbaBank.getThisBanksAccounts());
        return "show-accounts";
    }


    @RequestMapping(path = "/show-all/add", method = RequestMethod.GET)
    public String addAccount(@ModelAttribute(name = "account") BankAccount account, Model model) {

        return "addNewAccount";
    }

    @RequestMapping(path = "/show-all/add", method = RequestMethod.POST)
    public String addAccount(@ModelAttribute(name = "account") BankAccount account) {
        simbaBank.addAccount(account);
        return "redirect:/show-all";
    }

    @RequestMapping(path = "/show-all/raise", method = RequestMethod.POST)
    public String increaseBalance(@RequestParam("increaseInfo") BankAccount account) {
        account.increaseBalance();
        return "redirect:/show-all";
    }


}
