package com.codeclan.example.shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 26/02/2017.
 */

public class TestDebit {
    Debit debit;

    @Before
    public void before(){
        debit = new Debit("RBS", 1000.0, 1000.0);
    }

    @Test
    public void testCanDeductFromCard(){
        debit.deductFromCard(100.00);
        assertEquals(900.0, debit.getBalance(), 0.01);
    }

    @Test
    public void testCanAddToCard(){
        debit.addToCard(100.0);
        assertEquals(1100.0, debit.getBalance(), 0.01);
    }
}
