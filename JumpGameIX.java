public class JumpGameIX {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int[] minRight = new int[n], maxLeft = new int[n];
        maxLeft[0] = nums[0];
        minRight[n - 1] = nums[n - 1];

        for (int i = 0; i < n; i++) {
            maxLeft[i] = Math.max(nums[i], maxLeft[i - 1]);
        }
        
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        ans[n - 1] = maxLeft[n - 1];

        for (int i = n-2; i>=0; i--) {
            if (maxLeft[i] <= minRight[i + 1]) {
                ans[i] = maxLeft[i];
            }else ans[i]= minRight[i+1];
        }

        return ans;
       
    }
}
