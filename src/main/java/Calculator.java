class Calculator {

    int addition(int firstNumber, int secondNumber) {
        long result = (long) firstNumber + (long) secondNumber;
        handleOverflow(result);
        return (int) result;
    }

    int subtraction(int firstNumber, int secondNumber) {
        long result = (long) firstNumber - (long) secondNumber;
        handleOverflow(result);
        return (int) result;
    }

    double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        long result = (long) firstNumber * (long) secondNumber;
        handleOverflow(result);
        return (int) result;
    }

    private void handleOverflow(long result) {
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Number is too big");
        } else if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Number is too small");
        }
    }
}
