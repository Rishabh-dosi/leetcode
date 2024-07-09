public class AverageWaitingTime {
    public static double averageWaitingTime(int[][] customers) {
        double avg = 0;
        int totalCustomers = customers.length;
        int waiting = 0;
        for (int i = 0; i < totalCustomers; i++) {
            if (i > 0) {
                avg = avg + customers[i][1] + (customers[i][0] < waiting ? waiting - customers[i][0] : 0);
                waiting = customers[i][0] + customers[i][1] + (customers[i][0] < waiting ? waiting - customers[i][0] : 0);
                System.out.println(waiting);
            }
            else{
                avg = customers[i][1];
                waiting =customers[i][0] + customers[i][1];
                System.out.println(waiting);
            }
        }
        return avg/totalCustomers;
    }

    public static void main(String[] args) {
        int[][] customers = { { 1, 2 }, { 2, 5 }, { 4, 3 } };
        System.out.println(averageWaitingTime(customers));
    }
}

