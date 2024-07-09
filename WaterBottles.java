public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int maxBottleCount = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            maxBottleCount = maxBottleCount + emptyBottles / numExchange;
            emptyBottles = (emptyBottles % numExchange) + (emptyBottles / numExchange);
        }

        return maxBottleCount;

    }
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }
}
