import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        if (num.length() == k) {
            return "0";
        }

        for (Character ch : num.toCharArray()) {
            while (!s.isEmpty() && Integer.parseInt(String.valueOf(s.peek())) > Integer.parseInt(String.valueOf(ch) )
                    && k>0) {
                s.pop();
                --k;
            }
            s.push(ch);
        }
        while (k-- > 0) {
            s.pop();
        }
        StringBuilder ans = new StringBuilder();
        
        for (final char c : s) {
            if (c == '0' && ans.length() == 0)
                continue;
            ans.append(c);
        }
        

        return ans.length() == 0 ? "0" : ans.toString();
    }
    public static void main(String[] args) {
        String num = "10200";
        int k = 1;
        System.out.println(removeKdigits(num, k));
    }
}
