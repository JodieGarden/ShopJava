package com.codeclan.example.shop;

import java.util.HashMap;

/**
 * Created by user on 24/02/2017.
 */

public class Customer {
    private String name;
    private Debit debit;
    private Store store;
    private HashMap paymentMethods;




    public Customer(String name, Debit debit, Store store){
        this.debit = debit;
        this.name = name;
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Debit getDebit() {
        return this.debit;
    }

    public void setDebit(Debit debit) {
        this.debit = debit;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }


//    public Double payWithDebit(Double amount){
//        this.debit -= amount;
//        return this.debit;
//    }


//


}
