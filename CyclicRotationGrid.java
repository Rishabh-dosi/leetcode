import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicRotationGrid {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int r1 = 0, r2 = m - 1, c1 = 0, c2 = n - 1;

        while (r1 < r2 && c1 < c2) {
            int total = (r2 - r1) * 2 + (c2 - c1) * 2;
            int shift = k % total;
            int cycle[] = new int[total];
            int idx = 0;

            for (int i = c1; i < c2; i++)
                cycle[idx++] = grid[r1][i];
            for (int i = r1; i < r2; i++)
                cycle[idx++] = grid[i][c2];
            for (int i = c2; i > c1; i--)
                cycle[idx++] = grid[r2][i];
            for (int i = r2; i > r1; i--)
                cycle[idx++] = grid[i][c1];

            


            int[] array2 = IntStream.concat(Arrays.stream(cycle), Arrays.stream(cycle)).toArray();

            cycle = Arrays.copyOfRange(array2, shift, shift + idx);

            idx = 0;
            for (int i = c1; i < c2; i++)
                grid[r1][i] = cycle[idx++];
            for (int i = r1; i < r2; i++)
                grid[i][c2] = cycle[idx++];
            for (int i = c2; i > c1; i--)
                grid[r2][i] = cycle[idx++];
            for (int i = r2; i > r1; i--)
                grid[i][c1] = cycle[idx++];

            r1++;
            r2--;
            c1++;
            c2--;

        }
        return grid;
    }
}
