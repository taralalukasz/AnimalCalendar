package org.lukasz.model;

import java.util.List;

public class Week {
    private List<DayFrame> daysInWeek;

    public Week(List<DayFrame> daysInWeek) {
        this.daysInWeek = daysInWeek;
    }

    public List<DayFrame> getDaysInWeek() {
        return daysInWeek;
    }

    public void setDaysInWeek(List<DayFrame> daysInWeek) {
        this.daysInWeek = daysInWeek;
    }
}
