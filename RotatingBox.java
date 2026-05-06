import java.util.Arrays;

public class RotatingBox {
    public static char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] bg = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bg[i][j] = boxGrid[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = bg[i].length - 1;

            while (left < right) {
                char temp = bg[i][left];
                bg[i][left] = bg[i][right];
                bg[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (bg[j][i] == '.') {
                    int stoneRow = -1;
                    for (int k = j - 1; k >= 0; k--) {
                        if (bg[k][i] == '*') {
                            break;
                        } else {
                            if (bg[k][j] == '#') {
                                stoneRow = k;
                                break;
                            }
                        }
                    }
                    if (stoneRow != -1) {
                        bg[j][i] = '#';
                        bg[stoneRow][i] = '.';
                    }
                
                }
            }
        }
        System.out.println(Arrays.deepToString(bg));
        return bg;
    }
    
    public static void main(String[] args) {
        char[][] matrix = {
                { '#', '.', '*', '.' },
                { '#', '#', '*', '.' }
        };
        rotateTheBox(matrix);
    }
}
