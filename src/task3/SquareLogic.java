package task3;

public class SquareLogic {

    public double getSquareArea(double s_op) {
        double side_op = Math.sqrt(s_op);
        double radius = side_op / 2;
        double side_vp = Math.sqrt(2) * radius;
        double square_vp = Math.pow(side_vp, 2);
        return square_vp;
    }

    public double getSquareRatio(double s_op) {
        double side_op = Math.sqrt(s_op);
        double radius = side_op / 2;
        double side_vp = Math.sqrt(2) * radius;
        double square_vp = Math.pow(side_vp, 2);
        return s_op / square_vp;
    }
}
