package task2;

import static java.util.Calendar.*;

public class YearAndMonthLogic {

    public int getDaysInMonth(int year, int numberOfMonth) {
        int amountOfDays;
        switch (numberOfMonth - 1) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                amountOfDays = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                amountOfDays = 30;
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

    private static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
