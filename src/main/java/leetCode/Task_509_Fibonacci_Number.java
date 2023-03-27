package leetCode;

public class Task_509_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
        if (n == 0) return 0;
        int previous = 0;
        int real = 1;
        for (int i = 2; i <= n; i++) {
            int temporary = previous + real;
            previous = real;
            real = temporary;
        }
        return real;
    }

    public static int fib1(int n) {
        int[] array = new int[31];
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
