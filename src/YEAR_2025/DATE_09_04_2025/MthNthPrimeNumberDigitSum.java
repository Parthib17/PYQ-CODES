package YEAR_2025.DATE_09_04_2025;

import java.util.Scanner;

public class MthNthPrimeNumberDigitSum {
    public static boolean isPrime(int x){
        if (x<=1) return false;
        for (int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0)
                return false;
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

    public static int digitSum(int n){
        int sum=0;
        while (n>0){
            int ld = n%10;
            sum+=ld;
            n=n/10;
        }
        if(sum > 9){
            sum = digitSum(sum);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int m1 = digitSum(findNthPrime(m));
        int n1 = digitSum(findNthPrime(n));
        System.out.println(m1+"--"+n1);

        System.out.println(m*m1);
    }

}
