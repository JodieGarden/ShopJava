package com.codeclan.example.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Debit implements Payable {
    private String name;
    private Double balance;
    private Double limit;


    public Debit(String name, Double balance, Double limit){
    this.name = name;
    this.balance = balance;
    this.limit = limit;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public void deductFromCard(Double amount){
        this.balance -= amount;
    }

    public void addToCard(Double amount){
        this.balance += amount;
    }




}




