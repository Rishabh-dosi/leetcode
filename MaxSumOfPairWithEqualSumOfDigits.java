import java.util.HashMap;
import java.util.Map;

public class MaxSumOfPairWithEqualSumOfDigits {
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        int maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = sumOfDigits(nums[i]);
            if (map.containsKey(sum)) {

                maxSum = Math.max(maxSum, map.get(nums[i]) + nums[i]);
            }

            map.put(sum, Math.max(map.getOrDefault(sum, 0), nums[i]));

        }
        return maxSum;
        
    }
}