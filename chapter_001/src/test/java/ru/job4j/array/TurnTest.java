package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class TurnTest {

    @Test
    public void backTestEven() {
        int[] array = new int[]{9, 2, 4, 5};
        Assert.assertThat(new Turn().back(array), Is.is(new int[]{5, 4, 2, 9}));
    }

    @Test
    public void backTestUneven() {
        int[] array = new int[]{9, 2, 12, 4, 5};
        Assert.assertThat(new Turn().back(array), Is.is(new int[]{5, 4, 12, 2, 9}));
    }
}
