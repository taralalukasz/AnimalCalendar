package org.lukasz.util;

import java.time.LocalDate;
import java.time.YearMonth;

public class DayManager {

    public static int countFirstDayOfMonth(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        return date.getDayOfWeek().getValue();
    }

    public static int countDaysInMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }

}
