package com.codeclan.example.shop;

/**
 * Created by user on 26/02/2017.
 */

public class Transaction {
    TransactionType type;
    Double value;
    Customer customer;


public Transaction(TransactionType type, Double value, Customer customer){
    this.type = type;
    this.value = value;
    this.customer = customer;
}

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}