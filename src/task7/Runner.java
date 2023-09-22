package task7;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        ClosestPointLogic closestPointLogic = new ClosestPointLogic();
        System.out.println("Введите x1: ");
        int x1 = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите y1: ");
        int y1 = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите x2: ");
        int x2 = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите y2: ");
        int y2 = DataScanner.enterIntegerFromConsole();
        System.out.println(closestPointLogic.closerToOrigin(x1, y1, x2, y2));
    }
}
