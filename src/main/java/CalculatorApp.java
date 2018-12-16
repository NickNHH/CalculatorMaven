public class CalculatorApp {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int value1;
        int value2;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        value1 = 10;
        value2 = 20;
        System.out.println("Summe: " + value1 +  " + " + value2 + " = " + calculator.addition(value1, value2));
        System.out.println("Differenz: " + value1 + " + " + value2 + " = " + calculator.subtraction(value1, value2));
    }
}
