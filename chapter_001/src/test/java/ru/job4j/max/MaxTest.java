package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLess() {
        Max max = new Max();
        int result = max.max(4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        Max max = new Max();
        int result = max.max(-3, 17, 2);
        assertThat(result, is(17));
    }

}
