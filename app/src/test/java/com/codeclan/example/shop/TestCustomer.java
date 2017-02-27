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
        debit = new Debit("RBS", 1000.0, 1000.0);

        store = new Store("Topshop", 1000.0);

        customer = new Customer("Jenn",debit, store);

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

    }








