package task7;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        ClosestPointLogic closestPointLogic = new ClosestPointLogic();
        System.out.println("Введите x1: ");
        double x1 = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите y1: ");
        double y1 = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите x2: ");
        double x2 = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите y2: ");
        double y2 = DataScanner.enterDoubleFromConsole();
        System.out.println(closestPointLogic.closerToOrigin(x1, y1, x2, y2));
    }
}
