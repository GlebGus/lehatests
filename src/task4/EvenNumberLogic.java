package task4;

import java.util.stream.Stream;

public class EvenNumberLogic {

    public boolean evenNumber(int a, int b, int c, int d) {
        return Stream.of(a, b, c, d).filter(n -> n % 2 == 0)
                .count() >= 2;
    }
}
