package leetCode;

public class Task_28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        System.out.println(strStr("sddsadbutsad", "sad"));
    }
    public static int strStr(final String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (j == needle.length() - 1)
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (needle.charAt(j) != haystack.charAt(i + j))
                    break;
            }
        }
        return -1;
    }
}
