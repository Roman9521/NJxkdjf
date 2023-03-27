package recursion;

public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("fshijhidkhfhikdsjflksjdf"));
    }
    static int countHi(String str) {
        if (str.length() == 0) return 0;
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
}
