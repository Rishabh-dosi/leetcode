import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubarraysSumOfDistinctElementSquare1 {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int count = set.size();


                sum += count * count;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
