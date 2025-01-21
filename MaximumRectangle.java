import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {
    public static int maximalRectangle(char[][] mat) {
        int maxSum = 0;
        int n = mat.length;
        int m = mat[0].length;
        int[][] prefixSum = new int[n][m];
        for (int j = 0; j <= m - 1; j++) {
            for (int i = 0; i <= n - 1; i++) {
                if (mat[i][j] == '1') {
                    prefixSum[i][j] = (i == 0) ? 1 : prefixSum[i - 1][j] + 1;
                } else {
                    prefixSum[i][j] = 0;
                }
            }
        }
        for (int[] row : prefixSum)
            maxSum = Math.max(maxSum, largestRectangleArea(row));
        return maxSum;
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;
        int minLeft[] = new int[n];
        int minRight[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                s.pop();
            }
            if (s.isEmpty() == false)
                minLeft[i] = s.peek() + 1;
            else
                minLeft[i] = 0;
            s.push(i);
        }
        s.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] > heights[i]) {
                s.pop();
            }
            if (s.isEmpty() == false)
                minRight[i] = s.peek();
            else {
                minRight[i] = n;
            }
            s.push(i);
        }

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (minRight[i] - minLeft[i]);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
