package ru.job4j.conditon;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax13To2Then13() {
        int left = 13;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 13;
        Assert.assertEquals(result, expected);
    }
}