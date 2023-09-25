package task9;

public class CircleLogic {
    private double square;
    private double length;

    public CircleLogic(double radius) {
        this.square = Math.PI * radius * radius;
        this.length = 2.0 * Math.PI * radius;
    }

    public double getSquare() {
        return square;
    }

    public double getLength() {
        return length;
    }
}
