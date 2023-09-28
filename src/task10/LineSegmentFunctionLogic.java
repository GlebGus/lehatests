package task10;

public class LineSegmentFunctionLogic {
    public void lineSegmentFunction(double a, double b, double h) {
        if (a > b) {
            System.out.println("b должно быть больше a");
            return;
        }
        StringBuilder table = new StringBuilder();
        table.append("Аргумент\tЗначение функции\n");
        for (; a < b; a += h) {
            String argument = String.format("%.2f", a);
            String value = String.format("%.2f", Math.tan(a));
            table.append(argument).append("\t\t").append(value).append("\n");
        }
        System.out.println(table.toString());
    }
}
