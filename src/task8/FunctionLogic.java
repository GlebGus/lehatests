package task8;

public class FunctionLogic {
    public double function(double x) {
        double result = 0;
        try {
            if (x >= 3) {
                return result = -x * x + 3 * x + 9;
            } else {
                return result = 1 / ((x * x * x) - 6);
            }
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        return result;
    }
}
