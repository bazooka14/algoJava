public interface FibonacciSequence {
    /**
     * Вычисляет число Фибоначчи для заданного индекса
     * Кладет вычисленное число в переменную current
     * @param i
     */
    void calculate(int i);

    /**
     * Возвращает последнее вычисленное число Фибоначчи (current)
     * @return число Фибоначчи
     */
    long getCurrent();

    /**
     * Возвращает строковое представление числа Фибоначчи
     * @return строка число Фибоначчи
     */
    @Override
    String toString();
}
