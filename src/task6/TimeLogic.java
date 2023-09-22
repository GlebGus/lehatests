package task6;

public class TimeLogic {
    public String timeHasPassed(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        if (seconds >= 86401) {
            throw new IllegalArgumentException();
        }
        return "Часов: " + hours + ", минут: " + minutes + ", секунд: " + remainingSeconds;
    }
}
