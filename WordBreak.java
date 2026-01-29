import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static boolean[] t;
    public static boolean wordBreak(String s, List<String> wordDict) {
        t = new boolean[s.length()];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            t[i] = false;
        }
        return helper(s, 0, wordDict);
    }

    static boolean helper(String s, int i, List<String> wordDict) {
        if (i == s.length()) {
            return true;
        }
    

        if (t[i]) {
            return true;
        }
        for (int end = i + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(i, end)) &&
                    helper(s, end, wordDict)) {
                return t[i] = true;
            }
        }
        return t[i]=false;
            
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));

        System.out.println(wordBreak(s, wordDict));
    }
}
