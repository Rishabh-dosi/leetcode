import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] preSmaller(int[] a) {
        int ans[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && s.peek() > a[i]) {
                s.pop();
            }
            if (s.isEmpty())
                ans[i] = -1;
            else
                ans[i] = s.peek();

            s.push(a[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 10, 8 };
        System.out.println(Arrays.toString(preSmaller(a)));
    }
}
