package task7;

public class ClosestPointLogic {
    public String closerToOrigin(double x1, double y1, double x2, double y2) {
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (distance1 < distance2) {
            return "Точка A ближе к началу координат";
        } else if (distance2 < distance1) {
            return "Точка B ближе к началу координат";
        } else {
            return "Точки A и B находятся на одинаковом расстоянии от начала координат";
        }
    }
}
