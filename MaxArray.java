import java.util.HashMap;

public class MaxArray {
    static void maxAr(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int [] ar = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            ar[i] = sum;
        }
        for (int k : ar) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            }
            else {
                map.put(k, 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, -3 };
        maxAr(nums);
    }
}
