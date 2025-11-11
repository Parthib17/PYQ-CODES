package YEAR_2025.DATE_14_04_2025.Shift_1;

import java.util.*;
public class NthPrimeToNPlusMPrime {

    public static boolean isPrime(int x){
        if (x<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int findNthPrime(int n){
        int c=0;
        int num=2;
        while (c<n){
            if(isPrime(num)){
                c++;
            }
            num++;
        }

        return num-1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(m>n){
            int t = m;
            m = n;
            n = t;
        }

        int sum=0;
        for (int i=m;i<=m+n;i++){
            sum+=findNthPrime(i);
        }
        System.out.println(sum);
    }
}
