import java.util.ArrayList;

public class ProductOfNumber {
    private ArrayList<Integer> al = new ArrayList<>();
    public ProductOfNumber() {
        al.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            al.clear();
            al.add(1);
        }else{
            al.add(al.get(al.size()-1)*num);
        }
    }

    
    public int getProduct(int k) {
        int n = al.size();
        return n >k ? al.get(n-1)/al.get(n-k-1): 0;
    }    
}


