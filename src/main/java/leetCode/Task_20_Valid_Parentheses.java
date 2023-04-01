package leetCode;

import java.util.Stack;

public class Task_20_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c =='(')
                stack.add(')');
            else if (c == '[')
                stack.add(']');
            else if (c == '{')
                stack.add('}');
            else {
                if (stack.empty()) {
                    return false;
                }
                if (stack.lastElement() != c) {
                    return false;
                }
                stack.remove(stack.size() - 1);
            }
        }
        return stack.empty();
    }
}
