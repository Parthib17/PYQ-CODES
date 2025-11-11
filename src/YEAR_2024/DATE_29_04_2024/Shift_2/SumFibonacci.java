package YEAR_2024.DATE_29_04_2024.Shift_2;

import java.util.Scanner;

public class SumFibonacci {
    public static int sumFibonacci(int n){
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        else{
            int[] fib = new int[n];
            fib[0]=0;
            fib[1]=1;
            for(int i=2;i<n;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            int sum=0;
            for(int x : fib){
                sum+=x;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFibonacci(n));
    }
}

//
//import java.util.*;
//
//public class Main{
//    public static int fibo(int n){
//        if(n<=1){
//            return n;
//        }
//        if(n==2){
//            return 1;
//        }
//
//        return fibo(n-1) + fibo(n-2);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int s=0;
//        for(int i=0;i<n;i++){
//            s+=fibo(i);
//        }
//        System.out.println(s);
//
//    }
//}