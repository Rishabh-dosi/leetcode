import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ReverseParantheses {
    public static String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> pair = new HashMap<>();

        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                final int j = stack.pop();
                pair.put(i, j);
                pair.put(j, i);
            }

        for (int i = 0, d = 1; i < s.length(); i += d)
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair.get(i);
                d = -d;
            } else {
                sb.append(s.charAt(i));
            }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(abcd)";
        System.out.println(reverseParentheses(s));
    }
}
