import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(60, calculator.addition(10, 50));
    }

    @Test
    public void testSubtraction() {
        assertEquals(10, calculator.subtraction(20, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.division(40, 20));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        assertEquals(0, calculator.division(10, 0));
    }

    @Test
    public void testDivisionByZeroNotRaised() throws StackOverflowError {
        assertEquals(10, calculator.division(10, 1));
    }

    @Test
    public void testMultiplication() {
        assertEquals(100, calculator.multiplication(10, 10));
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiplication(1000, 0));
    }

    @Test
    public void testMultiplicationWithNegatives() {
        assertEquals(25, calculator.multiplication(-5, -5));
    }
}