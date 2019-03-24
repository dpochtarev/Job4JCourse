package ru.job4j.array;

public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean first = data[0][0];
        boolean second = data[0][data.length - 1];
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]
                    || data[data.length - 1 - i][i] != data[data.length - 2 - i][i + 1])
            {
                result = false;
                break;
            }
        }
        return result;
    }
}