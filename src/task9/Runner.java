package task9;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус: ");
        double radius = DataScanner.enterPositiveDoubleFromConsole();
        CircleLogic circleLogic = new CircleLogic();
        System.out.println(circleLogic.circleSquareAndLength(radius));
    }
}
