package recursion;

public class ChangePi {
    public static void main(String[] args) {
        System.out.println(changePi("xpixpip"));
    }
    static String changePi(String str) {
        if (str.length() == 0) return str;
        if (str.length() > 1 && str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
}
