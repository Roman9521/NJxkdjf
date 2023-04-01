package recursion;

public class StringClean {
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzzzzzaabb"));
    }
    public static String stringClean(String str) {
        if (str.length() > 1 &&str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        if (str.length() == 0) return "";
        return str.charAt(0) + stringClean(str.substring(1));
    }
}
