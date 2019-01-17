public class CalculatorApp {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.printMenu();
        controller.getInputs();
        controller.prepareCalculations();
        controller.printResult();
    }
}
