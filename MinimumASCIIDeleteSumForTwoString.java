public class MinimumASCIIDeleteSumForTwoString {

    public static int[][] t;

    public static int minimumDeleteSum(String s1, String s2) {

        int m = s1.length(), n = s2.length();
        t = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                t[i][j] = -1;
            }
        }
        return solve(0, 0, s1, s2);
    }

    public static int solve(int i, int j, String s1, String s2) {
        
        if (i >= s1.length() && j >= s2.length()) {
            return 0;
        }

        if (t[i][j] != 0) {
            return t[i][j];
        }
        if (i >= s1.length()) {
            return t[i][j]= (int) s2.charAt(j) + solve(i, j + 1, s1, s2);
        } else {
            
            if (j >= s2.length()) {
            return t[i][j] = (int) s1.charAt(i) + solve(i + 1, j, s1, s2);
            }

        } 

        if (s1.charAt(i) == s2.charAt(j)) {
            return t[i][j] = solve(i + 1, j + 1, s1, s2);
        }
        int leftTree = (int) s1.charAt(i) + solve(i + 1, j, s1, s2);
        int rightTree = (int) s2.charAt(j)+solve(i, j + 1, s1, s2);
        return t[i][j] = Math.min(leftTree, rightTree);
    }

    public static void main(String[] args) {
        
        System.out.println(minimumDeleteSum("sea", "eat"));
    }
}
