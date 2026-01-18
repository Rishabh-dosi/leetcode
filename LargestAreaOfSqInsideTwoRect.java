public class LargestAreaOfSqInsideTwoRect {
    public static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long max = 0;

        int n = bottomLeft.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long left = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                long right = Math.min(topRight[i][0], topRight[j][0]);
                long bottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                long top = Math.min(topRight[i][1], topRight[j][1]);

                if (right > left && top > bottom) {
                    long side = Math.min(right - left, top - bottom);
                    max = Math.max(max, side * side);
                }
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        int[][] bottomLeft = {
                { 1, 1},
                { 1, 3 },
                { 1, 5 }
        };

        int[][] topRight = {
                { 5, 5 },
                { 5, 7},
                { 5, 9}
        };

        System.out.println(largestSquareArea(bottomLeft, topRight));
    }
}
