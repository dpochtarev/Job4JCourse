package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        int index = array.length - 1;
        while (index >= 0) {
            for (int i = 0; i < index; i++) {
                int temp = array[i + 1];
                if (array[i] > array[i + 1]) {
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            index--;
        }
        return array;
    }

}
