package task3;

import scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        SquareLogic squareLogic = new SquareLogic();
        System.out.print("Введите площадь внешнего квадрата: ");
        double square = DataScanner.enterPositiveDoubleFromConsole();
        System.out.println("Площадь квадрата, вписанного в эту " +
                "окружность: " + squareLogic.getSquareArea(square) +
                " Площадь вписанного квадрата меньше площади заданного в " + squareLogic.getSquareRatio(square) + " раз");
    }
}
