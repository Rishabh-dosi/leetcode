public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int minOp = 0;
        for (String s : logs) {
            if (s.equals("../")) {
                if (minOp > 0) {
                    minOp--;
                }
            }
            else {
                if (!s.equals("./")) {
                    minOp++;
                }
            }
        }
        return minOp;
    }
    public static void main(String[] args) {
        String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println(minOperations(logs));;
        
    }
}