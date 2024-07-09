import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose {
    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
        System.out.println(matrix);
    }

    public static void main(String[] args) {
        int[][] ar = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(ar);
    }
}
