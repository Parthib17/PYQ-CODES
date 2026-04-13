package IPA_PRACTICE;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = 0;

        while(n>0){
            int ld = n % 10;
            t = t*10 + ld;
            n=n/10;
        }

        System.out.println(t);
    }
}
