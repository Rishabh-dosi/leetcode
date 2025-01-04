import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // ================================Brute force====================================================
        
        // int n1 = nums1.length;

        // int ans[] = new int[n1];
        // for (int i = 0; i < n1; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             if (j < nums2.length - 1) {
        //                 for (int k = j + 1; k < nums2.length; k++) {
        //                     if (nums2[k] > nums2[j]) {
        //                         ans[i] = nums2[k];
        //                         break;
        //                     } else {
        //                         ans[i] = -1;
        //                     }
        //                 }
        //             } else {
        //                 ans[i] = -1;
        //             }
        //         }
        //     }
        // }
        // return ans;
        // ------------------------------------Stack------------------------------
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                mp.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int num : nums1) {
            if (mp.containsKey(num)) {
                ans.add(mp.get(num));
            } else {
                ans.add(-1);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
        

    }
    public static void main(String[] args) {
        int nums1[] = { 4, 1, 2 };
        int nums2[] = { 1, 3, 4, 2 };
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
