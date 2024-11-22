import java.util.HashMap;
import java.util.Map;

public class MaximumSubArraySum {
    public static long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> s = new HashMap<Integer, Integer>();
        long maxsum = Long.MIN_VALUE;

        long curSum = 0;
        int i = 0;
        while (i < k && i<n) {
            curSum += nums[i];
            if (s.containsKey(nums[i])) {
                s.put(nums[i], s.get(nums[i]) + 1);
                i++;
            } else {
                s.put(nums[i], 1);
                i++;
            }
        }
        if (s.size() == k) {
            maxsum = curSum;
        }
        int left = 0;
        for (int j = k; j < n; j++) {
            if (s.containsKey(nums[j])) {
                s.put(nums[j], s.get(nums[j]) + 1);
            }
            else {
                s.put(nums[j], 1);
            }
            if (s.containsKey(nums[left])) {
                if (s.get(nums[left]) > 1) {
                    s.put(nums[left], s.get(nums[left] - 1));
                }
                else {
                    s.remove(nums[left]);
                }
                curSum = curSum + nums[j];
                curSum = curSum - nums[left];
                left++;
            }
            if (s.size() == k) {
                maxsum = Math.max(maxsum, curSum);
                System.out.println(s.toString());
            }
            
        }
        return maxsum;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 7, 8, 9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }
    
}
