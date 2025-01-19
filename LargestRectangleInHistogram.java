import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
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
                minLeft[i] = s.peek()+1;
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
    public static void main(String[] args) {
        int heights[] = { 2, 4 };
        System.out.println(largestRectangleArea(heights)  + "   ");
    }
}
