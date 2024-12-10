import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithNoRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        int total = 0;
        Map<Character, Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        mp.put(s.charAt(left), 0);
        while (right < s.length()) {

            if (mp.containsKey(s.charAt(right))) {

                left = Math.max(mp.get(s.charAt(right)) + 1, left);

            }
            mp.put(s.charAt(right), right);
            total = Math.max(total, (right - left + 1));
            right++;

        }
        return total;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));
    }
}
