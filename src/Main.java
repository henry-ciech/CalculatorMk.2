import java.util.*;
import java.math.*;

class Main { //город под подошвой

    private static final String TRY_AGAIN = "Try again";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        OperationHandler calculator = new OperationHandler();
        InputChecker inputCheck = new InputChecker();

        while (true) {
            printer.print("Enter the first number: ");
            String firstNumber = scanner.nextLine();
            if (inputCheck.isInputBigDecimal(firstNumber)) {
                printer.print(TRY_AGAIN);
                continue;
            }
            BigDecimal firstNumberBigDecimal = new BigDecimal(firstNumber);
            Wrapper.setFirstNumberInput(firstNumberBigDecimal);
            break;
        }

        while (true) {
            printer.print("Enter the second number: ");
            String secondNumber = scanner.nextLine();
            if (inputCheck.isInputBigDecimal(secondNumber)) {
                printer.print(TRY_AGAIN);
                continue;
            }
            BigDecimal secondNumberBigDecimal = new BigDecimal(secondNumber);
            Wrapper.setSecondNumberInput(secondNumberBigDecimal);
            break;
        }

        while (true) {
            printer.print("Enter the operator: ");
            String operator = scanner.nextLine();
            if (inputCheck.isOperatorCorrect(operator)) {
                printer.print(TRY_AGAIN);
                continue;
            } else if (operator.equals("/") && inputCheck.isItPossibleToDivide(Wrapper.getFirstNumberInput(),
                    Wrapper.getSecondNumberInput())) {
                printer.print("Can't divide by zero");
                continue;
            }
            Wrapper.setOperatorInput(operator);
            break;
        }

        calculator.calculate();
    }
}