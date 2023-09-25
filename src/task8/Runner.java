package task8;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        FunctionLogic functionLogic = new FunctionLogic();
        System.out.println("Введите x: ");
        double x = DataScanner.enterPositiveDoubleFromConsole();
        System.out.println("Значение функции F(x) при x = " + x + " равно: " + functionLogic.function(x));
    }
}
