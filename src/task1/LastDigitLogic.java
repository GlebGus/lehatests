package task1;

public class LastDigitLogic {
    public int getLastDigitOfSquare(int lastDigit) {
        return (int) (Math.pow(lastDigit % 10, 2) % 10);
    }
}
