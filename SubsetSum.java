public class SubsetSum {
    static boolean[][] t;

    public static boolean subsetSum(int[] arr, int sum) {
        t = new boolean[arr.length + 1][sum + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0 && j > 0) {
                    t[i][j] = false;
                } else if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        return helper(arr, sum, 0, 0);
    }

    private static boolean helper(int[] arr, int sum, int i, int j) {
        if (j == sum) {
            return true;
        }
        if (arr[i - 1] < j) {
            t[i][j] = helper(arr, sum, i, j + arr[i - 1]) || helper(arr, sum, i + 1, j);
        } else {
            t[i][j] = helper(arr, sum, i + 1, j);
        }
        return false;
    }
}
