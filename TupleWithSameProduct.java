import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (map.containsKey(nums[i] * nums[j])) {
                    map.put(nums[i] * nums[j], map.get(nums[i] * nums[j]) + 1);
                    count++;
                } else {
                    map.put(nums[i] * nums[j], 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count = count + ((entry.getValue()) * (entry.getValue() - 1) / 2);
            }
        }
        return count << 3;
        // same as
        // return count * 8;
        
    }
}
