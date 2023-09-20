package task4;

public class EvenNumberLogic {
    public boolean evenNumber(int a, int b, int c, int d) {
        if (Math.abs(a) % 2 == 0) {
            if (Math.abs(b) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(a) % 2 == 0) {
            if (Math.abs(c) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(b) % 2 == 0) {
            if (Math.abs(c) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(c) % 2 == 0) {
            if (Math.abs(d) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(b) % 2 == 0) {
            if (Math.abs(d) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(a) % 2 == 0) {
            if (Math.abs(d) % 2 == 0) {
                return true;
            }
        }
        if (Math.abs(a) % 2 == 0 &&
                Math.abs(b) % 2 == 0 &&
                Math.abs(c) % 2 == 0 &&
                Math.abs(d) % 2 == 0) {
        }
        return false;
    }
}
