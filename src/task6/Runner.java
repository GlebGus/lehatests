package task6;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        TimeLogic timeLogic = new TimeLogic();
        System.out.println("Введите секунды: ");
        int time = DataScanner.enterPositiveIntegerFromConsole();
        System.out.println(timeLogic.timeHasPassed(time) + " - прошло к этому моменту");
    }
}
