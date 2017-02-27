package com.codeclan.example.shop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 24/02/2017.
 */

public class TestShop {
    Shop shop;
    Debit debit;
    Store store;
    Customer customer;

    @Before
    public void before(){
        shop = new Shop("EMMMNESS",1000.0, 1000.0);
        customer = new Customer("Jenn", debit, store);
    }

    @Test
    public void testAddToBalance(){
        Double amount = 100.0;
        assertEquals(1100.0, shop.addToBalance(100.0), 0.01);
    }

    @Test
    public void testSubtractFromBalance(){
        Double amount = 100.0;
        assertEquals(900.0, shop.subtractFromBalance(100.0), 0.01);
    }
}
