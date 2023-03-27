package recursion;

public class PowerN {
    public static void main(String[] args) {
        System.out.println(powerN(3, 1));
    }
    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);

    }
}
