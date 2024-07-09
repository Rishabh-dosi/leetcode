import java.util.HashMap;

public class CountSubarray {

    public static long countSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, maxi = 0;
        long ans = 0;
        for (int el : nums) {
            maxi = Math.max(maxi, el);
        }
        while (j < nums.length) {
            if (nums[j] == maxi)
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.getOrDefault(maxi, 0) >= k) {
                ans += (n - j);
                if (nums[i] == maxi)
                    map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
