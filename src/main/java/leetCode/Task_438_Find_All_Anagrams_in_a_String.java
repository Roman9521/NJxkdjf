package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Task_438_Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
    public static List<Integer> findAnagrams(String s, String p ) {
        List<Integer> answer = new ArrayList<>();
        if (s.length() < p.length()) {
            return answer;
        }
        int[] count = new int[1 + 'z']; // char of p -, char of s +
        for (char c : p.toCharArray()) {
            count[c]--;
        }
        for (int i = 0; i < p.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        if (zeroAlphabet(count)) {
            answer.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            char toRemove = s.charAt(i - p.length());
            char toAdd = s.charAt(i);
            count[toRemove]--;
            count[toAdd]++;
            if (zeroAlphabet(count)) {
                answer.add(i - p.length() + 1);
            }
        }
        return answer;
    }

    static boolean zeroAlphabet(int[] array) {
        for (int zero : array) {
            if (zero != 0)  {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i <= (int) s.length() - (int) p.length(); i++) {
            int[] count = new int[1 + 'z']; // char of p +, char of s -
            for (char c : p.toCharArray()) {
                count[c]++;
            }
            for (int j = i; j < i + p.length(); j++) {
                char c = s.charAt(j);
                count[c]--;
            }
            boolean flag = true;
            for (char c = 'a'; c <= 'z'; c++) {
                if (count[c] != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer.add(i);
            }
        }
        return answer;
    }
}
