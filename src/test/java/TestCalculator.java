import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /*
    Addition
     */
    @Test
    public void testAdditionPositives() {
        assertEquals(60, calculator.addition(10, 50));
    }

    @Test
    public void testAdditionNegatives() {
        assertEquals(-60, calculator.addition(-10, -50));
    }

    @Test
    public void testAdditionPositiveNegative() {
        assertEquals(10, calculator.addition(20, -10));
    }

    @Test
    public void testAdditionNegativePositive() {
        assertEquals( -10, calculator.addition(-20, 10));
    }

    @Test
    public void testAdditionZero() {
        assertEquals(9, calculator.addition(0, 9));
    }

    @Test
    public void testAdditionLargeNumbers() {
        assertEquals(22192475, calculator.addition(12908733, 9283742));
    }

    @Test
    public void testAdditionRounding() {
        assertEquals(4, calculator.addition(5 / 2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingAddition() {
        assertEquals((long) Integer.MAX_VALUE + 1, calculator.addition(2147483647, 1));
    }

    /*
    Subtraction
     */
    @Test
    public void testSubtractionPositives() {
        assertEquals(10, calculator.subtraction(20, 10));
    }

    @Test
    public void testSubtractionNegatives() {
        assertEquals(-10, calculator.subtraction(-20, -10));
    }

    @Test
    public void testSubtractionPositiveNegative() {
        assertEquals(100, calculator.subtraction(90, -10));
    }

    @Test
    public void testSubtractionNegativePositive() {
        assertEquals(-100, calculator.subtraction(-90, 10));
    }

    @Test
    public void testSubtractionZero() {
        assertEquals(-30, calculator.subtraction(0, 30));
    }

    @Test
    public void testSubtractionLargeNumbers() {
        assertEquals(-22679313, calculator.subtraction(1298731, 23978044));
    }

    @Test
    public void testSubtractionRounding() {
        assertEquals(9, calculator.subtraction(21 / 2, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingSubtraction() {
        assertEquals((long) Integer.MIN_VALUE - 1, calculator.subtraction(-2147483648, 1));
    }

    /*
    Division
     */
    @Test
    public void testDivisionPositives() {
        assertEquals(2, calculator.division(40, 20), 0);
    }

    @Test
    public void testDivisionNegatives() {
        assertEquals(2, calculator.division(-40, -20), 0);
    }

    @Test
    public void testDivisionPositiveNegative() {
        assertEquals(-10, calculator.division(100, -10), 0);
    }

    @Test
    public void testDivisionNegativePositive() {
        assertEquals(-10, calculator.division(-100, 10), 0);
    }

    @Test(expected = AssertionError.class)
    public void testDivisionByZero() {
        assertEquals(0, calculator.division(10, 0), 0);
    }

    @Test
    public void testDivisionByZeroNotRaised() throws StackOverflowError {
        assertEquals(10, calculator.division(10, 1), 0);
    }

    @Test
    public void testDivisionPointNumbers() {
        assertEquals(1.5, calculator.division(3, 2), 1);
    }

    @Test
    public void testDivisionMorePointNumbers() {
        assertEquals(3.333, calculator.division(10, 3), 3);
    }

    /*
    Multiplication
     */
    @Test
    public void testMultiplicationPositives() {
        assertEquals(100, calculator.multiplication(10, 10));
    }

    @Test
    public void testMultiplicationNegatives() {
        assertEquals(100, calculator.multiplication(-10, -10));
    }

    @Test
    public void testMultiplicationPositiveNegative() {
        assertEquals(-120, calculator.multiplication(20, -6));
    }

    @Test
    public void testMultiplicationNegativePositive() {
        assertEquals(-120, calculator.multiplication(-20, 6));
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiplication(1000, 0));
    }

    @Test
    public void testMultiplicationLargeNumbers() {
        assertEquals(21900136, calculator.multiplication(932, 23498));
    }

    @Test
    public void testMultiplicationRounding() {
        assertEquals(6, calculator.multiplication(5 / 2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingMultiplication() {
        assertEquals((long) Integer.MAX_VALUE * 2, calculator.multiplication(2147483647, 2));
    }

    /*
    How to tests methods with different visibilities:
    - protected: Place your tests in the same package as the classes under test.
    - package protected: Same as protected.
    - public: Nothing special. Tests can be written from everywhere.
    - private: Normally, private methods which you have to test, are indicating that these methods should be moved into other classes to promote reusability.
               But if necessary, you can use reflection to subvert the access control.
     */
}