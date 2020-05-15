package br.com.mhbp.assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAdder {

    @Test
    public void test_Sum_Positive_Numbers_One_And_One() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(1, 1) == 2);
    }

    // can it add the positive numbers 1 and 2?
    @Test
    public void test_Sum_Positive_Numbers_One_And_Two() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(1, 2) == 3);
    }

    // can it add the positive numbers 2 and 2?
    @Test
    public void testSumPositiveNumbersTwoAndTwo() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(2, 2) == 4);
    }

    // is zero neutral?
    @Test
    public void testSumZeroNeutral() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(0, 0) == 0);
    }

    // can it add the negative numbers -1 and -2?
    @Test
    public void testSumNegativeNumbers() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(-1, -2) == -3);
    }

    // can it add a positive and a negative?
    @Test
    public void testSumPositiveAndNegative() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(-1, 1) == 0);
    }

    // how about larger numbers?
    @Test
    public void testSumLargeNumbers() {
        Adder adder = new AdderImpl();
        assertTrue(adder.add(1234, 988) == 2222);
    }
}
