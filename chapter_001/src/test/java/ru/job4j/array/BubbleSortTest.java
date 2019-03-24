package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        int[] array = new int[] {3, 2, 8, 5, 26, 4, 1, 7, 6, 9};
        Assert.assertThat(new BubbleSort().sort(array), Is.is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 26}));
    }
    @Test
    public void whenSortArrayWith3ElementsThenSortedArray() {
        int[] array = {5, 8, -2};
        Assert.assertThat(new BubbleSort().sort(array), Is.is(new int[]{-2, 5, 8}));
    }
}
