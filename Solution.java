import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
class Solution{
    static int[] maxpop(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i++) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;

        
    }
        

    

    public static void main(String[] args) {
        ArrayList<List<String>> al = new ArrayList<List<String>>();
        List l = new ArrayList<String>();
        l.add("hello");
        l.add("mera");
        l.add("naam");
        List l2 = new ArrayList<String>();
        l2.add("rd");
        l2.add("hh");
        l2.add("jj");
        
        al.add(l);
        al.add(l2);

        maxpop(al, "sdas" ,  "sda");
    }
}