import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ar = s.trim().split(" ");
        int arr[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(arr));
    }
    
}
