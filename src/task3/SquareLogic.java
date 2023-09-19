package task3;

public class SquareLogic {

    public double getSquareArea(double circumscribedSquare) {
        double sideOp = Math.sqrt(circumscribedSquare);
        return calculateSquare(sideOp);
    }

    public double getSquareRatio(double squareRatio) {
        double sideOp = Math.sqrt(squareRatio);
        return squareRatio / calculateSquare(sideOp);
    }

    private double calculateSquare(double circumscribedSquare) {
        double radius = circumscribedSquare / 2;
        double sideVp = Math.sqrt(2) * radius;
        return Math.pow(sideVp, 2);
    }
}
