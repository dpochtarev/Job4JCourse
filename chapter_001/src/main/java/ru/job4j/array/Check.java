package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length; index++) {
            if (index != data.length - 1) {
                result = data[index] && data[index + 1];
            }  else {
                result = data[index] && data[index - 1];
            }
        }
        return result;
    }
}
