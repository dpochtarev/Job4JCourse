package ru.job4j.max;

public class Max {

    /**+
     * Returns max value from two values
     * @param first
     * @param second
     * @return max value
     */
    public int max(int  first, int second) {
        return first < second ? second : first;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
