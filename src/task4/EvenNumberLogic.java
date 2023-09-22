package task4;

import java.util.Arrays;
import java.util.stream.Stream;

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
        return false;
    }

    public boolean evenNumber1(int a, int b, int c, int d) {
        return Stream.of(a, b, c, d).filter(n -> n % 2 == 0)
                .count() >= 2;
    }
}
