package task5;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        PerfectNumberLogic perfectNumberLogic = new PerfectNumberLogic();
        System.out.println("Введите число : ");
        int perfectNumber = DataScanner.enterPositiveIntegerFromConsole();
        System.out.println(perfectNumberLogic.isPerfectNumber(perfectNumber));
    }
}
