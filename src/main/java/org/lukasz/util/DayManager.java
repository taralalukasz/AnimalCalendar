package org.lukasz.util;

import java.time.LocalDate;
import java.time.YearMonth;

public class DayManager {

    public static int countFirstDayOfMonth(Integer year, Integer month) {
        LocalDate date = LocalDate.of(year, month, 1);
        return date.getDayOfWeek().getValue();
    }

    public static int countDaysInMonth(Integer year, Integer month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }

}
