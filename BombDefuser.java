import java.util.Arrays;

public class BombDefuser {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) {
            return ans;
        }
        for (int i = 0; i < n; i++) {
            if (k > 0) {

                ans[i] = 0;
                for (int j = 1; j <= k; j++) {
                    ans[i] += code[(i + j) % n];
                    System.out.println(i + " value: " + ans[i] + " index added: " + (i + j) % n);
                }

            }
            else {
                ans[i] = 0;
                
                for (int j = 1; j <= Math.abs(k); j++) {
                    ans[i] += code[((i - j) < 0 ? ((n + (i - j))%n) : (i - j))];
                    System.out.println(i + " value: " + ans[i] + " k : " + k);

                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int k = -2;
        int code[] = { 2, 4, 9, 3};
        int ans[] = decrypt(code, k);
        System.out.println(Arrays.toString(ans));
    }
}
