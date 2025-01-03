import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {

                if (st.isEmpty())
                    return false;
                char c = st.peek();
                if ((s.charAt(i) == '}' && c == '{') || (s.charAt(i) == ')' && c == '(')
                        || (s.charAt(i) == ']' && c == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
