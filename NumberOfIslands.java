public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i >= n || i < 0 || j >= m || j < 0) {
            return;
        }
        if (grid[i][j] == '0' || grid[i][j] == 'v') {
            return;
        }
        grid[i][j] = 'v';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

    }
    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '1', '1', '0'}, { '1', '1', '0', '1', '0'}, { '1', '1', '0', '0', '0'},{ '0',
                '0', '0', '0', '0' } };
        System.out.println(numIslands(grid));
    }
}
