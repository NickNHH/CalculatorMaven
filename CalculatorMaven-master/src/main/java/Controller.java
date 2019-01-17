import java.util.Scanner;

class Controller {

    private Scanner scanner = new Scanner(System.in);

    private Calculator calculator = new Calculator();

    private int input;

    private int value1;

    private int value2;

    private double result;

    private String operation;

    void printMenu() {
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        System.out.println("Wählen Sie die Operation aus:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraktion");
        System.out.println("3) Division");
        System.out.println("4) Multiplikation");
    }

    void getInputs() {
        System.out.print("Auswahl: ");
        input = scanner.nextInt();

        System.out.print("Erste Zahl: ");
        value1 = scanner.nextInt();

        System.out.print("Zweite Zahl: ");
        value2 = scanner.nextInt();
    }

    void prepareCalculations() {
        switch (input) {
            case 1:
                result = calculator.addition(value1, value2);
                operation = "+";
                break;
            case 2:
                result = calculator.subtraction(value1, value2);
                operation = "-";
                break;
            case 3:
                result = calculator.division(value1, value2);
                operation = "/";
                break;
            case 4:
                result = calculator.multiplication(value1, value2);
                operation = "*";
                break;
            default:
                System.out.println("Ungültige Auswahl!");
        }
    }

    void printResult() {
        System.out.println("Ergebnis: " + value1 + " " + operation + " " + value2 + " = " + result);
    }
}
