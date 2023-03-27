package recursion;

public class CountX {
    public static void main(String[] args) {
        System.out.println(countX("xxhixxxxxx"));
    }
    static int countX(String str) {
        if (str.length() == 0) return 0;
        if (str.charAt(0) == 'x') {
            return 1 + countX(str = str.substring(1));
        }
        return countX(str = str.substring(1));
    }
}
