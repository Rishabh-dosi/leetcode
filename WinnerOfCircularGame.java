import java.util.ArrayList;
import java.util.List;

public class WinnerOfCircularGame {
    public static int findTheWinner(int n, int k) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(i);
        }
        int index = 0;
        while (l.size() > 1) {
            // Calculate the index of the friend to be removed
            index = (index + k - 1) % l.size();
            l.remove(index);
        }
        return l.get(0);
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int result = findTheWinner(n, k);
        System.out.println(result);
    }
}
