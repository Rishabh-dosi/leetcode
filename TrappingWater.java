public class TrappingWater {
    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        // --------------------------Naive Approach O(N*2)--------------------------
        // for (int i = 1; i < n; i++) {
        //     int j = i;
        //     int leftMax = 0;
        //     int rightMax = 0;
        //     while (j >= 0) {
        //         leftMax = Math.max(leftMax, height[j]);
        //         j--;
        //     }
        //     int k = i;
        //     while (k <= n - 1) {
        //         rightMax = Math.max(rightMax, height[k]);
        //         k++;
        //     }
        //     ans = ans + (Math.min(rightMax, leftMax) - height[i]);
        // }
        // ------------------------------------------Better Approach O(3n)-------------------------------------
        
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        suffixMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        prefixMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            ans += Math.min(prefixMax[i], suffixMax[i]) - height[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
