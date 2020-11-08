package day_20201012;

import java.util.Stack;

public class CharValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char a: chars) {
            if (a == '(' || a == '{' || a == '[') {
                stack.add(a);
            } else {
                if(stack.isEmpty())
                    return false;
                if (a == ')' && stack.pop() != '(')
                    return false;
                if (a == '}' && stack.pop() != '{')
                    return false;
                if (a == ']' && stack.pop() != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{]}"));
        System.out.println(isValid("((([{}])))"));
        System.out.println(isValid("]{}()["));
        System.out.println(isValid("((([]))}"));
        System.out.println(isValid("{{[]()[]}}"));
    }
}
