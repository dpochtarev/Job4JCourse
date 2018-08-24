package ru.job4j.loop;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void addTest() {
        Assert.assertThat(new Counter().add(0, 5), Is.is(6));
    }
}
