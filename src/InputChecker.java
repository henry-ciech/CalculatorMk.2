import java.math.*;

class InputChecker {
    boolean isInputBigDecimal(String input) {
        try {
            new BigDecimal(input);
            return false;
        } catch (NumberFormatException exception) {
            return true;
        }
    }

    boolean isItPossibleToDivide(BigDecimal firstNumber, BigDecimal secondNumber) {
        try {
            firstNumber.divide(secondNumber, 2, RoundingMode.HALF_UP);
            return false;
        } catch (ArithmeticException exception) {
            return true;
        }
    }

    boolean isOperatorCorrect(String operator) {
        return !operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/");
    }
}