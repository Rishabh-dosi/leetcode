import java.util.HashMap;
import java.util.Map;

public class NumberOfDistinctColorOfBalls {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        Map<Integer, Integer> ballColor = new HashMap<>();
        int result[]= new int[n];
        Map<Integer, Integer> colorMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            if (ballColor.containsKey(x)) {
                int prevColor = ballColor.get(x);
                colorMap.put(prevColor, colorMap.get(prevColor) - 1);
                if (colorMap.get(prevColor) == 0) {
                    colorMap.remove(prevColor);
                }
            }
            ballColor.put(x, y);
            colorMap.put(y, colorMap.getOrDefault(y, 0) + 1);
            result[i] = colorMap.size();
        }
        return result;
    }
}
