public class ContainerWithMostWater {
    // problem 11 container with most water
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int maxVol = Integer.MIN_VALUE;
        while (i < j) {
            int newVol = (j - i) * Math.min(height[i], height[j]);
            System.out.println(newVol);
            maxVol = Math.max(maxVol, newVol);
            if (height[j] > height[i])
                i++;
            else
                j--;
        }
        return maxVol;
    }
    public static void main(String[] args) {
        int height[] = {1,1};
        System.out.println(maxArea(height));
    }

}
