public class Fib {
    private int previous;
    private int current;

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
            int temp = current;
            current += previous;
            previous = temp;
        }
    }

    public int getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return Integer.toString(current);
    }
}
