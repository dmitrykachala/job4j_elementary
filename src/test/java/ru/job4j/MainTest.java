package ru.job4j;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        Assert.assertThat(result, CoreMatchers.is(excepted));
    }
}
