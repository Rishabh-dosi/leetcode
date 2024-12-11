import java.util.HashMap;

public class LongestSubstringThatOccurThrice {
    public static int maxLength(String s) {
        int n = s.length();
        int max = 0;
        HashMap<StringBuilder, Integer> ss = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sr = new StringBuilder(String.valueOf(s.charAt(i)));
            if (ss.containsKey(sr)) {
                System.out.println(sr + " 66");
                ss.put(sr, ss.get(sr) + 1);
            } else {
                System.out.println(sr + " 67");
                ss.put(sr, 1);
            }
            for (int j = i+1; j < n; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    System.out.println(sr + " 68");
                    sr.append(s.charAt(j));
                    if (!ss.containsKey(sr)) {
                        System.out.println(sr + " 69");
                        ss.put(sr, 1);
                    } else {
                        System.out.println(sr + " 64");
                        ss.put(sr, ss.get(sr) + 1);
                        max = Math.max(max, ss.get(sr));
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(ss.toString());
        return 0;
    }
    public static void main(String[] args) {
        String inp = "abcdef";
        System.out.println(maxLength(inp));
    }
}