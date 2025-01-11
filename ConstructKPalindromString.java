import java.util.HashMap;

public class ConstructKPalindromString {
    public static boolean canConstruct(String s, int k) {
        boolean ans = true;
        if (s.length() < k) {
            return false;
        }
        int[] letterCount = new int[26];
        for (Character ch : s.toCharArray()) {
            letterCount[ch - 'a']++;
        }
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < 26; i++) {
            if (letterCount[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount > k) {
            return false;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(canConstruct(s, k));
    }
}
