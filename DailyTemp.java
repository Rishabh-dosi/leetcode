public class DailyTemp {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int wait = 0;
            for (int j = i; j < n; j++) {
                if (temperatures[j] < temperatures[i]) {
                    wait += 1;
                }
            }
            ans[i] = wait;

        }
        return ans;

    }
    public static void main(String[] args) {
        int temperatures[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println(dailyTemperatures(temperatures));
    }

}
