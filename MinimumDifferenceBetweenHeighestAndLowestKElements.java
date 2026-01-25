import java.util.Arrays;

public class MinimumDifferenceBetweenHeighestAndLowestKElements {
    public static int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0, j=k-1; i < nums.length && j <nums.length ; i++, j++) {
            
                min = Math.min(nums[j] - nums[i ], min);
            
        }

        return min;
    }
    
    public static void main(String[] args) {
        int nums[] = { 9, 4, 1, 7 };
        System.out.println(minimumDifference(nums, 2));
        
    }
}
