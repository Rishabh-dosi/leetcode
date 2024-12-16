import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ArrayStateAfterKManipulation1 {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a ,b) -> {
            if (nums[a] == nums[b]) {
                 return a - b;  // If values are the same, compare indices
            }
            return nums[a] - nums[b];

        }
        );
        for (int i = 0; i < nums.length; i++) {
            pq.offer(i);
        }
        while (k > 0) {
            int min = pq.poll();
            nums[min] *= multiplier;
            pq.offer(min);
            k--;
        }
        return nums;
        
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 5, 6 };
        int k = 5;
        int multiplier = 2;
        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
    }

}
