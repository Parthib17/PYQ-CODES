package YEAR_2025.DATE_31_03_2025.Shift_2;

import java.util.Scanner;

public class NthPrimeToMPrimeProduct {

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
        int res = (findNthPrime(m) * findNthPrime(n))-1;
        System.out.println(res);
    }
}
