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
    public void subtraction() {
        assertEquals(10, calculator.subtraction(20, 10));
    }
}