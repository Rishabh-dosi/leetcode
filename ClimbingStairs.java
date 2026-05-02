public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(0, n, dp);
    }

    public static int helper(int idx, int n, int[] dp) {
        if (idx == n) {
            return 1;
        }
        if (idx > n)
            return 0;
        if (dp[idx] != 0)
            return dp[idx];
        int oneStep = helper(idx + 1, n, dp);
        int twoStep = helper(idx + 2, n, dp);

        int count = oneStep + twoStep;
        dp[idx] = count;
        return count;
    }
}
