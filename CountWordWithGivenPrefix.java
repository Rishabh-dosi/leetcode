public class CountWordWithGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String s : words) {
            if (s.startsWith(pref))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String words[] = { "pay", "attention", "practice", "attend" };
        String pref = "at";
        System.out.println(prefixCount(words, pref));
    }
}
