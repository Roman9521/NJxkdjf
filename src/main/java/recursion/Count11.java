package recursion;

public class Count11 {
    public static void main(String[] args) {
        System.out.println(count11("111asdasd11sda111"));
    }
    public static int count11(String str) {
        if (str.length() <= 1) return 0;
        if (str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}
