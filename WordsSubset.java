import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        HashMap<Character, Integer> requiredFrequencyMap = new HashMap<>();

        // Step 1: Build the required frequency map based on words2
        for (String word : words2) {
            HashMap<Character, Integer> wordFreqMap = new HashMap<>();
            for (char ch : word.toCharArray()) {
                wordFreqMap.put(ch, wordFreqMap.getOrDefault(ch, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : wordFreqMap.entrySet()) {
                requiredFrequencyMap.put(entry.getKey(),
                        Math.max(requiredFrequencyMap.getOrDefault(entry.getKey(), 0), entry.getValue()));
            }
        }

        // Step 2: Check each word in words1
        for (String word : words1) {
            HashMap<Character, Integer> wordFreqMap = new HashMap<>();
            for (char ch : word.toCharArray()) {
                wordFreqMap.put(ch, wordFreqMap.getOrDefault(ch, 0) + 1);
            }

            boolean isSubset = true;
            for (Map.Entry<Character, Integer> entry : requiredFrequencyMap.entrySet()) {
                char ch = entry.getKey();
                int requiredFreq = entry.getValue();

                if (wordFreqMap.getOrDefault(ch, 0) < requiredFreq) {
                    isSubset = false;
                    break;
                }
            }

            if (isSubset) {
                result.add(word);
            }
        }

        return result;
    }
}
