package com.codeclan.example.shop;

/**
 * Created by user on 24/02/2017.
 */

public class Shop {
    private String name;
    private Double balance;
    private Double sales;



    public Shop(String name, Double balance, Double sales){
        this.name = name;
        this.balance = balance;
        this.sales = sales;
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

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public Double addToBalance(Double amount){
        this.balance += amount;
        return this.balance;
    }

    public Double subtractFromBalance(Double amount){
        this.balance -= amount;
        return this.balance;
    }



}
