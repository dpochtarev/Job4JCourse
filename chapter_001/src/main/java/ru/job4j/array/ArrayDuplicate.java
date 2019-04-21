package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {
            for (int i = 0; i < array.length; i++) {
                String temp = array[i];
                for (int j = 0; j < array.length; j++) {
                    if (i != j && temp.equals(array[j])) {
                        for (int k = 0; k < array.length - 1; k++) {
                            if (k < j) {
                                array[k] = array[k];
                            } else {
                              array[k] = array[k + 1];
                            }
                        }
                        array = Arrays.copyOf(array, array.length - 1);
                    }
                }
            }
        return array;
    }

}
