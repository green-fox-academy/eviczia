package com.greenfox.simba.controllers;

import com.greenfox.simba.models.Bank;
import com.greenfox.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(path = "/show-all/increase", method = RequestMethod.POST/*, params="action=raise"*/)
    public String increaseBalance(@ModelAttribute(name = "name") String name) {
        for (BankAccount account : simbaBank.getThisBanksAccounts()) {
            if (account.getName().equals(name)) {
                account.increaseBalance();
            }
        }

        return "redirect:/show-all";

    }
    @RequestMapping(path = "/show-all/decrease", method = RequestMethod.POST/*, params="action=raise"*/)
    public String decreaseBalance(@ModelAttribute(name = "name") String name) {
        for (BankAccount account : simbaBank.getThisBanksAccounts()) {
            if (account.getName().equals(name)) {
                account.decreaseBalance();
            }
        }

        return "redirect:/show-all";

    }
}
