package com.greenfox.simba.models;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;
    private boolean isGood;

    public BankAccount() {
    }

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        isKing = false;
        isGood = true;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        isGood = true;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGood = isGood;
    }

    public boolean isKing() {
        return isKing;
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

    public void setIsKing(boolean king) {
        isKing = king;
    }

    public boolean getIsGood() {
        return isGood;
    }

    public void setIsGood(boolean isGood) {
        this.isGood = isGood;
    }

    public void increaseBalance() {
        if (animalType == null) {
            System.err.println("keep looking!");
        } else {

            int increaseBy = (animalType.equals("lion")) ? 100 : 10;
            setBalance(getBalance() + increaseBy);
        }
    }

    public void decreaseBalance() {
        if (animalType == null) {
            System.err.println("keep looking!");
        } else {

            int decreaseBy = (animalType.equals("lion")) ? 100 : 10;
            setBalance(getBalance() - decreaseBy);
        }
    }
}

