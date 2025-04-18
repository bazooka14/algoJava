public class Fib {
    private long previous;
    private long current;

    public Fib(int i) {
        CalcFib(i);
    }

    public void CalcFib(int i) {
        if (i < 1)
            throw new IllegalArgumentException("Номер должен быть натуральным числом");

        current = 0;
        previous = 1;
        while (i > 1) {
            i--;
            long temp = current;
            current += previous;
            previous = temp;
        }
    }

    public long getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return Long.toString(current);
    }
}
