package recursion;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("axaxax"));
    }
    public static int countPairs(String str) {
        if (str.length() <= 1) return 0;
        if (str.length() >= 3 && str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }
}
