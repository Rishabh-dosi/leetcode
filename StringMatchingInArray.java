import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static List<String> stringMatching(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        for (String s : words) {
            String initialString = s;
            for (int i = 0; i < words.length; i++) {
                int index = initialString.indexOf(words[i]);
                if (index != -1 && words[i] != initialString && !ans.contains(words[i])) {
                    ans.add(words[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = { "leetcoder", "leetcode", "od", "hamlet", "am" };
        System.out.println(stringMatching(words).toString());
    }
}
