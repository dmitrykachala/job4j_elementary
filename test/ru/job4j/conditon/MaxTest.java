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

    @Test
    public void whenMax11To11Then11() {
        int left = 11;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax50ToMinus77To33To0Then50() {
        int first = 50;
        int second = -77;
        int third = 33;
        int result = Max.max(first, second, third);
        int expected = 50;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To72To13To0Then72() {
        int first = 15;
        int second = 72;
        int third = 13;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 72;
        Assert.assertEquals(result, expected);
    }
}