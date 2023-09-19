package task2;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        YearAndMonthLogic yearAndMonthLogic = new YearAndMonthLogic();
        System.out.println("Введите год: ");
        int x = DataScanner.enterIntegerFromConsole();
        System.out.println("Введите номер месяца: ");
        int x1 = DataScanner.enterIntegerFromConsole();
        System.out.println("Год : " + x + ", месяц: " + x1 + ", количество дней в месяце: " + yearAndMonthLogic.getDaysInMonth(x, x1));
    }
}
