package org.lukasz.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BasicDateModel {
    @NotNull
    @Min(value = 2017, message = "You cannot choose year lower than 2017")
    @Max(value = 2050, message = "You cannot choose year higher than 2050")
    private Integer year;

    @NotNull
    @Min(value = 1, message = "The lowest month value : 1")
    @Max(value = 12, message = "The highest month value : 12")
    private Integer month;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BasicDateModel(Integer year, Integer month) {
        this.year = year;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicDateModel that = (BasicDateModel) o;
        return Objects.equals(year, that.year) &&
                Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, month);
    }
}
