public class lastDigit {
    public static void main(String[] args) {
        System.out.println(theLastDigit(124));
    }
    public static int theLastDigit(int lastDigit) {
        return (int) (Math.pow(lastDigit % 10, 2) % 10);
    }
}
