package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void subTest() {
        Calculator calc = new Calculator();
        calc.subtract(9d, 5d);
        double result = calc.getResult();
        double expected = 4d;
        assertThat(result, is(expected));
    }

    @Test
    public void divTest() {
        Calculator calc = new Calculator();
        calc.div(10d, 5d);
        double result = calc.getResult();
        double expected = 2d;
        assertThat(result, is(expected));
    }

    @Test
    public void multipleTest() {
        Calculator calc = new Calculator();
        calc.multiple(5d, 5d);
        double result = calc.getResult();
        double expected = 25d;
        assertThat(result, is(expected));
    }
}

