package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] array = {"London", "is", "the", "capital", "London", "of", "Great", "the", "Britain"};
        String[] resultArray = new ArrayDuplicate().remove(array);
        String[] expectArray = {"London", "is", "the", "capital", "of", "Great", "Britain"};
        assertThat(resultArray, is(expectArray));
    }
}
