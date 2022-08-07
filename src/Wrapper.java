import java.math.*;

class Wrapper {
    private static BigDecimal firstNumberInput = new BigDecimal(0);
    private static BigDecimal secondNumberInput = new BigDecimal(0);
    private static String operatorInput = " ";

    static void setFirstNumberInput(BigDecimal firstNumberInputParametr) {
        firstNumberInput = firstNumberInputParametr;
    }

    static BigDecimal getFirstNumberInput() {
        return firstNumberInput;
    }

    static void setSecondNumberInput(BigDecimal secondNumberInputParametr) {
        secondNumberInput = secondNumberInputParametr;
    }

    static BigDecimal getSecondNumberInput()  {
        return secondNumberInput;
    }

    static void setOperatorInput(String operatorInputParametr) {
        operatorInput = operatorInputParametr;
    }

    static String getOperatorInput() {
        return operatorInput;
    }
}