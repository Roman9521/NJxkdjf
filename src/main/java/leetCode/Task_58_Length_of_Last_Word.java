package leetCode;

public class Task_58_Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        String[] arrayWords = s.split(" ");
        return arrayWords[arrayWords.length - 1].length();
    }
}
