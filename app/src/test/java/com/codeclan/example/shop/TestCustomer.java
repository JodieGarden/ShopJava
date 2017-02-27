package com.codeclan.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by user on 24/02/2017.
 */

public class TestCustomer {
    Customer customer;
    Debit debit;
    Store store;


    @Before
    public void before() {
        customer = new Customer("Jenn",debit, store);

        debit = new Debit("RBS", 1000.0, 1000.0);

        store = new Store("Topshop", 1000.0);

    }

    @Test
    public void testGetName(){
        assertEquals("Jenn", customer.getName());
    }

    @Test
    public void testGetDebit(){
        assertEquals(debit, customer.getDebit());
    }

    @Test
    public void testGetStore(){
        assertEquals(store, customer.getStore());
    }
    @Test
    public void testGetPaymentMethod() {
        assertEquals("RBS", customer.getDebit());
    }

    @Test
    public void testGetPaymentMethod2() {
        assertEquals("Topshop", customer.getStore());
    }


}





