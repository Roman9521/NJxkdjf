package leetCode;

public class Task_409_Longest_Palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("sdjshfaksdsSDdsSjhdkasjnxjkjhjjhkajshd"));
    }
    public static int longestPalindrome(String s) {
        int[] array = new int[128];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)]++;
        }
        int evenNumber = 0;
        int singleNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenNumber += array[i];
            else if (array[i] > 2) {
                evenNumber += array[i] - 1;
                if (singleNumber == 0)
                    singleNumber++;
            } else if (array[i] == 1 && singleNumber == 0) {
                singleNumber++;
            }
        }
        return evenNumber + singleNumber;
    }
}

