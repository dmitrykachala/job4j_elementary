package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinus103To13ThenMinus2610() {
        int start = -103;
        int finish = 13;
        int result = Counter.sumByEven(start, finish);
        int expected = -2610;
        Assert.assertEquals(expected, result);
    }
}