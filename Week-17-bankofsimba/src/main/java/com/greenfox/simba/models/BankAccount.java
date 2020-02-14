package com.greenfox.simba.models;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;
    private String goodOrBad;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        isKing = false;
        goodOrBad = "good";
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        goodOrBad = "good";
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing, String goodOrBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.goodOrBad = goodOrBad;
    }

    public BankAccount(String name, double balance, String animalType, String goodOrBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.goodOrBad = goodOrBad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean getIsKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(String goodOrBad) {
        this.goodOrBad = goodOrBad;
    }
}
