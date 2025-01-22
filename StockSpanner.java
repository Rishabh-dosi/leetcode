import java.util.Stack;

public class StockSpanner {
    class Pair {
        int value;
        int idx;

        Pair(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }
    }

    private static Stack<Pair> s;
    private static int index;
    public StockSpanner() {
        s = new Stack<>();
        index = -1;
    }

    public int next(int price) {
        index = index + 1;
        while (!s.isEmpty() && price >= s.peek().value) {
            s.pop();
        }
        int ans = index - (s.isEmpty()? -1 : s.peek().idx); 
        Pair newPair = new Pair(price, index);
        s.push(newPair);
        return ans;
        
    }
    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        spanner.next(100);
        spanner.next(80);
        spanner.next(60);
        spanner.next(70);
        spanner.next(60);
        spanner.next(75);
        spanner.next(85);

    }
}
