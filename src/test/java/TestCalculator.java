import static org.junit.Assert.*;

public class TestCalculator {
    private Calculator calculator;

    @org.junit.Test
    public void testAddition() {
        calculator = new Calculator();
        assertEquals(60, calculator.addition(10, 50));
    }
}