package com.it_academy.practice.junit_basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate('-'), -3);
    }

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate('+'), 11);
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator(10, 5);
        assertEquals(calculator.calculate('/'), 2);
    }

    @Test
    public void testDivisionException() {
        assertThrows(ArithmeticException.class, () -> new Calculator(8, 0).calculate('/'));
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate('*'), 28);
    }

    @Test
    public void exponentiationTest() {
        Calculator calculator = new Calculator(2, 4);
        assertEquals(calculator.calculate('^'), 16);
    }

    @Test
    public void testNotValidData1() {
        Calculator calculator = new Calculator(8, 4);
        char expected = '/';
        char actual = '$';
        assertFalse(expected == actual);
    }

    @Test
    public void testNotValidData2() {
        Calculator calculator = new Calculator(88_888_888_8, -879_798_778);
        int expected1 = Integer.MAX_VALUE;
        int expected2 = Integer.MIN_VALUE;
        assertTrue(calculator.getA() < expected1);
        assertFalse(calculator.getB() < expected2);

    }

    @Test
    public void extractingNumberRootTest() {
        Calculator calculator = new Calculator(4, 2);
        assertEquals(calculator.calculate('s'), 2);
    }

    @Test
    public void subtractionManyNumersTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate2(new int[]{1, 2, 5}, '-'), -6);

    }

    @Test
    public void sumManyNumbersTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate2(new int[]{1, 2, 5}, '+'), 8);
    }

    @Test
    public void divisionManyNumbersTest() {
        Calculator calculator = new Calculator(10, 5);
        assertEquals(calculator.calculate2(new int[]{12, 2, 3}, '/'), 2);
    }

    @Test
    public void multiplicationManyNumbersTest() {
        Calculator calculator = new Calculator(4, 7);
        assertEquals(calculator.calculate2(new int[]{2, 2, 3}, '*'), 12);
    }


}