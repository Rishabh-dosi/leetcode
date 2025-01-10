import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArrayMinimums {
    public static int sumSubarrayMins(int[] arr) {
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // Stack<Integer> s = new Stack<>();
        // s.push(arr[i]);
        // int min = Integer.MAX_VALUE;
        // for (int j = i; j < arr.length; j++) {
        // // while (!s.isEmpty() && s.peek() > arr[j]) {
        // // s.pop();
        // // }
        // // s.push(arr[j]);
        // // System.out.println(s.peek());
        // // sum += s.peek();
        // System.out.println(arr[j] + " "+ min);
        // min = Math.min(min, arr[j]);
        // sum += min;

        // }
        // }
        // return sum;
        int n = arr.length;
        long ans = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left , -1);
        Arrays.fill(right, n);

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty() == false) {
                left[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if (s.isEmpty() == false) {
                right[i] = s.peek();
            }
            s.push(i);
        }
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            ans += (long) (i - left[i]) * (right[i] - i) * arr[i] % mod;
            ans %= mod;
        }
        
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));
    }
}
