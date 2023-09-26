package task9;

public class CircleLogic {
    public String circleSquareAndLength(double radius) {
        double length = 2.0 * radius * Math.PI;
        double square = radius * radius * Math.PI;
        return "Длина круга: " + length + ", Площадь круга: " + square;
    }
}
