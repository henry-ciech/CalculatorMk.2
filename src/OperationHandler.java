import java.math.*;

class OperationHandler {
    void calculate() {
        MathContext mc = new MathContext(2);
        BigDecimal decimalFirstNum = new BigDecimal(String.valueOf(Wrapper.getFirstNumberInput()));
        BigDecimal decimalSecondNum = new BigDecimal(String.valueOf(Wrapper.getSecondNumberInput()));
        BigDecimal result;

        switch (Wrapper.getOperatorInput()) {
            case ("+") -> {
                result = decimalFirstNum.add(decimalSecondNum);
                System.out.println(result);
                break;
            }
            case ("-") -> {
                result = decimalFirstNum.subtract(decimalSecondNum, mc);
                System.out.println(result.toPlainString());
                break;
            }
            case ("/") -> {
                result = decimalFirstNum.divide(decimalSecondNum, 2, RoundingMode.HALF_UP);
                System.out.println(result);
                break;
            }
            case ("*") -> {
                result = decimalFirstNum.multiply(decimalSecondNum);
                System.out.println(result);
                break;
            }
        }
    }
}
