package task1;


import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        LastDigitLogic lastDigit = new LastDigitLogic();
        System.out.println("Введите число: ");
        int x = DataScanner.enterIntegerFromConsole();
        System.out.println("Последняя цифра квадрата числа " + x + ", это: " + lastDigit.getLastDigitOfSquare(x));
    }
}
