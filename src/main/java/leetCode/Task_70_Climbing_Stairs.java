package leetCode;

public class Task_70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        int previous = 1;
        int real = 2;
        for (int i = 3; i <= n; i++) {
            int temporary = previous + real;
            previous = real;
            real = temporary;
        }
        return real;
    }

    public static int climbStairsFibonaccci(int n) {
        int[] array = new int[46];
        array[1] = 1;
        array[2] = 2;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
