package ru.job4j.converter;

public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли
     * @param value евро
     * @return рубли
     */
    public int eurotoRur(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли
     * @param value доллары
     * @return рубли
     */
    public int usdRur(int value) {
        return value * 60;
    }
}
