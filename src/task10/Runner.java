package task10;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        LineSegmentFunctionLogic functionLogic = new LineSegmentFunctionLogic();
        System.out.println("Введите a: ");
        double a = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите b: ");
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите h: ");
        double h = DataScanner.enterPositiveDoubleFromConsole();
        functionLogic.lineSegmentFunction(a, b, h);
    }
}
