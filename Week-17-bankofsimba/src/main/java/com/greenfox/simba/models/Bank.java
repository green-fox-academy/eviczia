package com.greenfox.simba.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> thisBanksAccounts;

    public Bank() {
        thisBanksAccounts = new ArrayList<>();
    }

    public void addAccount(BankAccount bankAccount) {
        thisBanksAccounts.add(bankAccount);
    }

    public void fillList() {
        thisBanksAccounts.add(new BankAccount("Timon", 500, "meerkat"));
        thisBanksAccounts.add(new BankAccount("Simba", 2000, "lion", true));
        thisBanksAccounts.add(new BankAccount("Shenzi", 800, "spotted hyena", false, false));
        thisBanksAccounts.add(new BankAccount("Banzai", 800, "spotted hyena", false, false));
        thisBanksAccounts.add(new BankAccount("Scar", 5000, "lion", true, false));
    }

    public List<BankAccount> getThisBanksAccounts() {
        return thisBanksAccounts;
    }

    public void setThisBanksAccounts(List<BankAccount> thisBanksAccounts) {
        this.thisBanksAccounts = thisBanksAccounts;
    }
}
