public class MaxJumpsToReactLastIndex {
    public int maximumJumps(int[] nums, int target) {
        Integer[] t = new Integer[nums.length];
        // Arrays.fill(nums, null);
        return helper(0, nums, target, t);
    }

    public int helper(int idx, int[] nums, int target, Integer[] t) {
        if (idx == nums.length - 1) {
            return 0;
        }
        if (t[idx] != null) {
            return t[idx];
        }
        int ans = -1;
        for (int i = idx + 1; i < nums.length; i++) {
            int diff = nums[i] - nums[idx];
            if (Math.abs(diff) <= target) {
                int next;

                next = helper(i, nums, target, t);

                if (next != -1) {
                    ans = Math.max(ans, next + 1);
                }

            }
        }
        return t[idx] = ans;
    }
}
