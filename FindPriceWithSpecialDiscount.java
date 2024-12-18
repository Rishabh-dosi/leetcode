import java.util.Arrays;

public class FindPriceWithSpecialDiscount {
    public static int[] finalPrice(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int discount = 0;
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            ans[i] = prices[i] - discount;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] prices = { 8, 4, 6, 2, 3 };
        System.out.println(Arrays.toString(finalPrice(prices)));
    }
}
