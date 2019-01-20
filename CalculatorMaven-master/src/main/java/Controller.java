import java.util.Scanner;

class Controller {

    private Scanner scanner = new Scanner(System.in);

    private Calculator calculator = new Calculator();

    private String input;

    private int value1;

    private int value2;

    private double result;

    private String operation;

    private void printMenu() {
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        System.out.println("Wählen Sie die Operation aus:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraktion");
        System.out.println("3) Division");
        System.out.println("4) Multiplikation");
        System.out.println("x) Programm beenden");
    }

    private void getOperation() {
        System.out.print("Auswahl: ");
        input = scanner.nextLine();
    }

    private void getNumbers() {
        System.out.print("Erste Zahl: ");
        value1 = scanner.nextInt();

        System.out.print("Zweite Zahl: ");
        value2 = scanner.nextInt();
    }

    void mainLoop() {
        do {
            printMenu();
            getOperation();

            input = input.toLowerCase().trim();
            switch (input) {
                case "x":
                    System.out.println("Beende Programm...");
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                    prepareCalculations(input);
                    break;
                default:
                    System.out.println("Ungültige Auswahl!");
            }
        } while (!input.equals("x"));
    }

    private void prepareCalculations(String input) {
        getNumbers();
        switch (input) {
            case "1":
                result = calculator.addition(value1, value2);
                operation = "+";
                break;
            case "2":
                result = calculator.subtraction(value1, value2);
                operation = "-";
                break;
            case "3":
                result = calculator.division(value1, value2);
                operation = "/";
                break;
            case "4":
                result = calculator.multiplication(value1, value2);
                operation = "*";
                break;
            default:
        }
        printResult();
        continueCalculations();
    }

    private void printResult() {
        System.out.println("Ergebnis: " + value1 + " " + operation + " " + value2 + " = " + result);
    }

    private void continueCalculations() {
        System.out.println();
        System.out.println("Beliebiger Input eingeben um fortzufahren.");
        scanner.next();
        System.out.println("\n\n\n\n");
    }
}
