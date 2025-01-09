public class CountPrefixSuffixPair1 {
    public static boolean isPrefixAndSuffix(String str1, String str2) {
        boolean finalAns = false;
        if (str2.length() < str1.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                finalAns = true;
            }
            else {
                return false;    
            }
        }
        for (int i = 0; i <str1.length(); i++) { 
            if (str1.charAt(i) == str2.charAt(str2.length() - str1.length() + i)){
                finalAns = true;
            }
            else{
                return false;
            }
        }
        return finalAns;
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])){
System.out.println(words[i] + " " + words[j]);                
                    count++;}
            }
        }
        return count;
    }
   public static void main(String[] args) {
       String[] words = { "pa","papa","ma","mama" };
       System.out.println(countPrefixSuffixPairs(words));
   }
}
