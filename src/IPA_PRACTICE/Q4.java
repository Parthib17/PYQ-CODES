package IPA_PRACTICE;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = 0;

        int temp = n;

        while(n>0){
            int ld = n % 10;
            t = t*10 + ld;
            n=n/10;
        }

        boolean res = t == temp ? true : false;
        System.out.println(res);
    }
}
