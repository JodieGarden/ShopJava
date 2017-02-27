package com.codeclan.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 26/02/2017.
 */

public class TestTransaction {
    Shop shop;
    Customer customer;
    Debit debit;
    Store store;
    Transaction sale;
    Transaction refund;

    @Before
    public void before(){
        shop = new Shop("Yes", 1000.0, 1000.0);
        customer = new Customer("Jodie", debit, store);
        sale = new Transaction(TransactionType.sale, 200.0, customer);
        refund = new Transaction(TransactionType.refund, 200.0, customer);
        debit = new Debit("Ye", 1000.0, 1000.0);
        store =  new Store("Topshop", 1000.0);
    }

    @Test
    public void testSaleAndAddToStore(){
        shop.addToBalance(100.0);
        assertEquals(1100.0, shop.getBalance(), 0.01);
        debit.deductFromCard(100.0);
        assertEquals(900.0, debit.getBalance(), 0.01);
    }

    @Test
    public void testRefundAndDeductFromStore(){
        shop.subtractFromBalance(100.0);
        assertEquals(900.0, shop.getBalance(), 0.01);
        store.addToCard(100.0);
        assertEquals(100.0, store.getBalance(), 0.01);
    }

}
