package IPA_PRACTICE;
import java.util.*;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        while(n>0){
            int ld = n%10;
            c++;
            n = n/10;
        }

        System.out.println(c);

    }
}
