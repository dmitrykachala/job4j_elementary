package ru.job4j.conditon;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP71111K413Square1983941() {
        double expected = 19839.41;
        double p = 711.11;
        double k = 4.13;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    //dfdfgdfddf

    @Test
    public void whenP31K15Square57() {
        double expected = 57.66;
        double p = 31;
        double k = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP14K3Square918() {
        double expected = 9.18;
        double p = 14;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}