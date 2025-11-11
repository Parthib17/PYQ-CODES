package CAMPUSMONK_PYQ;

import java.util.*;

public class Arraytemp{
    public static int gcd(int a,int b){
        int x = a;
        int y = b;
        while(y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return x;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a,b);
        int lcf = (a*b)/gcd;
        System.out.println(gcd+" <-> "+lcf);
    }
}