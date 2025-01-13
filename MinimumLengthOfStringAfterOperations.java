import java.util.HashMap;
import java.util.Map;

public class MinimumLengthOfStringAfterOperations {
    public static int minimumLength(String s) {
        int[] freq = new int[26]; // Create an array to store the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // Increment the frequency of the character
        }

        int length = 0;
        for (int count : freq) {
            if (count % 2 == 1) { // If the frequency is odd
                length += 1;
            } else {
                length += Math.min(2, count); // If the frequency is even, take the minimum of 2 and the frequency
            }
        }
        return length;

    }
}
