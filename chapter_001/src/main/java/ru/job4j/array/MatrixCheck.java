package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean first = data[0][0];
        boolean second = data[0][data.length - 1];
        for (int i = 0; i < data.length; i++) {
            if (data[i][i] == first) {
                first = data[i][i];
            } else {
                return false;
            }
            if (data[i][data.length - 1 - i] == second) {
                second = data[i][data.length - 1 - i];
            } else {
                return false;
            }
        }
        return result;
    }
}