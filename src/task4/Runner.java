package task4;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        EvenNumberLogic evenNumberLogic = new EvenNumberLogic();
        System.out.println("Введите число A: ");
        int a = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите число B: ");
        int b = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите число C: ");
        int c = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите число D: ");
        int d = DataScanner.enterIntegerFromConsole();
        System.out.println(evenNumberLogic.evenNumber(a, b, c, d));
    }
}
