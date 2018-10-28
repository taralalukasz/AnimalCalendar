package org.lukasz.util;

import org.lukasz.model.DayFrame;
import org.lukasz.model.Week;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MonthManager {
    private static int DAY_NUMBER_IN_MONTH = 0;
    private static int DAYS_LEFT = 0;
    private static final int TOTAL_DAYS_IN_WEEK = 7;

    public static List<Week> createMonth(int firstDayOfMonth, int numberOfDaysInMonth) {
        validateInputArguments(firstDayOfMonth, numberOfDaysInMonth);

        List<Week> weekList = new ArrayList<>();
         DAY_NUMBER_IN_MONTH = 1;
         DAYS_LEFT = numberOfDaysInMonth;

         /*the maximum number of weeks during the month is six
         for instance 1st october 2017 is at sunday during 1st week
         but 31st october 2017 is at tuesday during 6th week*/
        weekList.add(countFirstWeek(firstDayOfMonth));
        weekList.add(countAnyOtherWeekThanFirst());
        weekList.add(countAnyOtherWeekThanFirst());
        weekList.add(countAnyOtherWeekThanFirst());
        weekList.add(countAnyOtherWeekThanFirst());
        weekList.add(countAnyOtherWeekThanFirst());

        return weekList.stream()
                .filter(week -> week != null)
                .collect(Collectors.toList());
    }

    private static void validateInputArguments(int firstDayOfMonth, int numberOfDaysInMonth) {
        if (firstDayOfMonth < 1
                || firstDayOfMonth > 8
                || numberOfDaysInMonth < 1
                || firstDayOfMonth > 31) {
            throw new IllegalArgumentException("First day of month or total number of days in month are invalid values.");
        }
    }

    private static Week countFirstWeek(int firstDayOfMonth) {
        List<DayFrame> listOfDays = new ArrayList<>();
        for (int dayNumberInWeek=1; dayNumberInWeek <=TOTAL_DAYS_IN_WEEK ; dayNumberInWeek++) {
            if (dayNumberInWeek < firstDayOfMonth ) {
                listOfDays.add(new DayFrame(false, 0, 0));
            } else {
                listOfDays.add(new DayFrame(true, dayNumberInWeek, DAY_NUMBER_IN_MONTH));
                //increment dayNumber
                ++DAY_NUMBER_IN_MONTH;
                //one day less left from the month
                --DAYS_LEFT;
            }
        }
        return new Week(listOfDays);
    }

    private static Week countAnyOtherWeekThanFirst() {
        if (DAYS_LEFT > 0) {
            //create corner case last week
            List<DayFrame> listOfDays = new ArrayList<>();
            for (int dayNumberInWeek=1; dayNumberInWeek <=TOTAL_DAYS_IN_WEEK ; dayNumberInWeek++) {
                if(DAYS_LEFT > 0) {
                    listOfDays.add(new DayFrame(true, dayNumberInWeek, DAY_NUMBER_IN_MONTH));
                    ++DAY_NUMBER_IN_MONTH;
                    --DAYS_LEFT;
                } else {
                    listOfDays.add(new DayFrame(false, 0, 0));
                }
            }
            return new Week(listOfDays);
        }
        return null;
    }

}
