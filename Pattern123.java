import java.util.Stack;

public class Pattern123 {
    public static boolean find132pattern(int[] nums) {
        // int n = nums.length;
        // Stack<Integer> s = new Stack<>();

        // for (int i = 0; i < n - 2; i++) {
        //     s.push(nums[i]);
        //     if ((nums[i + 1] > nums[i]) && (nums[i + 1] > nums[i + 2]) && (nums[i+2] > nums[i])) {
        //         s.push(nums[i + 1]);
        //         s.push(nums[i + 2]);
        //         System.out.println(s.toString());
        //     } else {
        //         s.pop();
        //     }
        // }

        // return !s.isEmpty();
        // -------------------------------------------O(n^2)---------------------------------------------
        // int n = nums.length;
        // int n1 = nums[0];
        // for (int j = 1; j < n - 1; j++) {
        //     n1 = Math.min(n1, nums[j]);
        //     for (int k = j + 1; k < n; k++) {
        //         if (n1 < nums[k] && nums[k] < nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // --------------------------------------------Stack O(n)-----------------------------
        int n = nums.length;
        int n3 = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; --i) {
            if (nums[i] < n3) {
                return true;
            }
            while (!s.isEmpty() && s.peek() < nums[i]) {
                n3 = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 5, 0, 3, 4 };
        System.out.println(find132pattern(nums));
    }
}
