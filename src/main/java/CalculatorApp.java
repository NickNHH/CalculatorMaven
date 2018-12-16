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
        System.out.println("Summe: " + value1 +  " + " + value1 + " = " + calculator.addition(value1, value2));
    }
}
