import static sun.util.calendar.BaseCalendar.*;
import static sun.util.calendar.BaseCalendar.FEBRUARY;

public class yearAndMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(100, 2));
    }
    public static int getDaysInMonth(int year, int numberOfMonth) {
        int amountOfDays;
        switch (numberOfMonth) {
            case JANUARY:
                amountOfDays = 31;
                break;
            case MARCH:
                amountOfDays = 31;
                break;
            case APRIL:
                amountOfDays = 30;
                break;
            case MAY:
                amountOfDays = 31;
                break;
            case JULY:
                amountOfDays = 31;
                break;
            case JUNE:
                amountOfDays = 30;
                break;
            case AUGUST:
                amountOfDays = 31;
                break;
            case SEPTEMBER:
                amountOfDays = 30;
                break;
            case OCTOBER:
                amountOfDays = 31;
                break;
            case NOVEMBER:
                amountOfDays = 30;
                break;
            case DECEMBER:
                amountOfDays = 31;
                break;
            case FEBRUARY:
                if (isLeapYear(year)) {
                    amountOfDays = 29;
                } else {
                    amountOfDays = 28;
                }
                break;
            default:
                amountOfDays = -1;
        }
        return amountOfDays;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
