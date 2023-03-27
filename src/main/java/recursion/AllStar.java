package recursion;

public class AllStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }
    public static String allStar(String str) {
        if (str.length() > 1) {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        } else {
            return String.valueOf(str.charAt(0));
        }
    }
}
