package org.lukasz.model;

/**
 * Class representing one frame in calendar i.e. one day.
 */
public class DayFrame {
    private boolean toBeRendered;

    /**
     * If toBeRendered is false, then these fields are irrelevant
     */
    private int dayNumberInWeek;
    private int dayNumberInMonth;


    public DayFrame(boolean toBeRendered, int dayNumberInWeek, int dayNumberInMonth) {
        this.toBeRendered = toBeRendered;
        this.dayNumberInWeek = dayNumberInWeek;
        this.dayNumberInMonth = dayNumberInMonth;
    }

    public boolean isToBeRendered() {
        return toBeRendered;
    }

    public void setToBeRendered(boolean toBeRendered) {
        this.toBeRendered = toBeRendered;
    }

    public int getDayNumberInWeek() {
        return dayNumberInWeek;
    }

    public void setDayNumberInWeek(int dayNumberInWeek) {
        this.dayNumberInWeek = dayNumberInWeek;
    }

    public int getDayNumberInMonth() {
        return dayNumberInMonth;
    }

    public void setDayNumberInMonth(int dayNumberInMonth) {
        this.dayNumberInMonth = dayNumberInMonth;
    }
}
