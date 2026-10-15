import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinimumSqOfDifference{
    public long minSquare(int[] nums1, int[] nums2, int k1, int k2){
        long sum = 0;
        int k = k1 + k2;

        int[] diff = new int[nums1.length];
        int maxDiff = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }
        int[] countDiff = new int[maxDiff + 1];
        for (int d : diff) {
            countDiff[d]++;
        }
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            int countOps = (int) Math.min(countDiff[i], k);
            countDiff[i] -= countOps;
            countDiff[i - 1] += countOps;
            k -= countOps;
        }

        for (long d = 1; d <= maxDiff; d++) {
            sum += countDiff[(int) d] * d * d;
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}