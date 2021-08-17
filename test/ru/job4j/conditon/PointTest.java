package ru.job4j.conditon;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when37to63then5() {
        double expected = 5;
        int x1 = 3;
        int y1 = 7;
        int x2 = 6;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3712to633then10111() {
        double expected = 101.11;
        int x1 = 37;
        int y1 = -12;
        int x2 = -63;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3712to333then37528() {
        double expected = 375.28;
        int x1 = -371;
        int y1 = 2;
        int x2 = 3;
        int y2 = 33;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}