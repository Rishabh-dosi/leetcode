import java.util.Arrays;
import java.util.HashSet;

public class PrefixCommonOfTwoArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        HashSet<Integer> mapA = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            mapA.add(A[i]);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (mapA.contains(B[j])) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] A = { 2, 3, 1 };
        int[] B = { 3, 1, 2 };
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
}
