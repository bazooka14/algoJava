import java.util.Arrays;
public class FibonacciRecursive implements FibonacciSequence{
    private long current;

    public FibonacciRecursive(int i) {
        calculate(i);
    }

    public void calculate(int i) {
        if (i == 0) current = 0;
        else {
            long[] mem = new long[i + 1];
            Arrays.fill(mem, -1);
            current = fibRecursion(i-1, mem);
        }
    }

    private long fibRecursion (int i, long[] mem){
        if (mem[i] != -1) return mem[i];
        if (i <= 1) return 1;
        long result = fibRecursion(i - 1, mem) + fibRecursion(i - 2, mem);
        mem[i] =  result;
        return result;
    }

    public long getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        return Long.toString(current);
    }
}
