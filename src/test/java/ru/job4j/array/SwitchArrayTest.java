package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = ru.job4j.array.SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = ru.job4j.array.SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to3() {
        int[] input = {1, 2, 3, 4, 6, 7};
        int source = 5;
        int dest = 3;
        int[] result = ru.job4j.array.SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 7, 6, 4};
        Assert.assertArrayEquals(expected, result);
    }
}