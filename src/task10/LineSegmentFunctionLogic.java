package task10;

public class LineSegmentFunctionLogic {
    public void lineSegmentFunction(double a, double b, double h) {
        if (a > b) {
            System.out.println("b должно быть больше a");
            return;
        }
        StringBuilder table = new StringBuilder();
        table.append("+-----------+---------------------+\n");
        table.append("|  Аргумент |  Значение функции   |\n");
        table.append("+-----------+---------------------+\n");
        for (; a < b; a += h) {
            String argument = String.format("%-1.2f", a);
            String value = String.format("%-20.2f", Math.tan(a)); // выравнивание значения функции
            table.append(String.format("|  %-6s |  %-18s |\n", argument, value));
        }
        table.append("+-----------+---------------------+\n");
        System.out.println(table.toString());
    }
}
