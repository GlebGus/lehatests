package task3;

public class SquareLogic {

    public double getSquareArea(double square) {
        double sideOp = Math.sqrt(square);
        double radius = sideOp / 2;
        double sideVp = Math.sqrt(2) * radius;
        double squareVp = Math.pow(sideVp, 2);
        return squareVp;
    }

    public double getSquareRatio(double square) {
        double squareVp = getSquareArea(square);
        return square / squareVp;
    }
}

