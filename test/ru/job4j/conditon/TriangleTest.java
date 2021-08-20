package ru.job4j.conditon;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void when222Exist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void when374Exist() {
        double ab = 3;
        double ac = 7;
        double bc = 4;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}