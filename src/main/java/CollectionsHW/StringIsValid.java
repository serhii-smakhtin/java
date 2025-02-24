package CollectionsHW;

import java.util.Stack;

public class StringIsValid {
    public static void init() {
        System.out.println("");
        System.out.println("Valid Parentheses");
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([])")); // true
    }

    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();

        // Check all symbols
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {// Open
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {// Close
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
