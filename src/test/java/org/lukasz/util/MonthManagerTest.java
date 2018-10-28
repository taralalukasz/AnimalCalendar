package org.lukasz.util;

import org.junit.Assert;
import org.junit.Test;

import static org.lukasz.util.MonthManager.createMonth;

public class MonthManagerTest {

    @Test
    public void testMonthRenderCreation() {
        Assert.assertEquals(5, createMonth(5, 30).size());
        Assert.assertEquals(6, createMonth(7, 31).size());
        Assert.assertEquals(6, createMonth(6, 31).size());
        Assert.assertEquals(6, createMonth(7, 30).size());
        Assert.assertEquals(4, createMonth(1, 28).size());
        Assert.assertEquals(5, createMonth(2, 28).size());
    }
}