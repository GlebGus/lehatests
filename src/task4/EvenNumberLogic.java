package task4;

public class EvenNumberLogic {
    public boolean evenNumber(int a, int b, int c, int d) {
        if (a % 2 == 0 && a >= 10) {
            if (b % 2 == 0 && b >= 10) {
                return true;
            }
        }
        if (a % 2 == 0 && a >= 10) {
            if (c % 2 == 0 && c >= 10) {
                return true;
            }
        }
        if (a % 2 == 0 && a >= 10) {
            if (d % 2 == 0 && d >= 10) {
                return true;
            }
        }
        return false;
    }
}