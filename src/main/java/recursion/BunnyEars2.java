package recursion;

public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(3));
    }
    static int bunnyEars2(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) return 3 + bunnyEars2(n - 1);
        return 2 + bunnyEars2(n - 1);
    }
}
