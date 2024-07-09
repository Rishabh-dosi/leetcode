import java.util.Arrays;
import java.util.HashMap;

public class QueueStackQuestions {

    public static int maxSubArray(int[] nums, int k) {
        int i = 0, j = 0;
        int ans = 0;
        HashMap<Integer , Integer> map = new HashMap<Integer ,Integer>();
        while (j < nums.length) {
            if (!map.containsKey(nums[j])) {
                map.put(nums[j], 1);
            } else {
                map.put(nums[j], map.get(nums[j]) + 1);
            }
            while (map.get(nums[i]) > k && i <= j) {
                i++;
                map.put(nums[i], map.get(nums[i]) - 1);
            }
            ans = Math.max(ans, i - j + 1);
            j++;
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3, 1, 2 };
        System.out.println(
            "answer is " + maxSubArray(nums , 2));

    }
}
