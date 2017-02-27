package com.codeclan.example.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Store implements Payable{
    String name;
    Double balance;
    Double limit;



    public Store(String name, Double limit){
        this.name = name;
        this.balance = 0.0;
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
