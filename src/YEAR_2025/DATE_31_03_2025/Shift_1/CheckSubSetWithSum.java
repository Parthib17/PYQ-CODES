package YEAR_2025.DATE_31_03_2025.Shift_1;

import java.util.Scanner;

public class CheckSubSetWithSum {

    public static boolean solve(int index, int k,int[] arr){
        if(k==0) return true;
        if(index == 0) return arr[0] == k;

        boolean notTake = solve(index-1,k,arr);
        boolean take = false;

        if(arr[index]<=k){
            take = solve(index-1,k-arr[index],arr);
        }
        return take || notTake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();

        if(solve(arr.length-1,k,arr)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

//import java.util.*;
//class Main {
//    public static boolean recur(int[] arr, int i, int k, int[][] dp){
//        if(k == 0){
//            dp[i][k] = 1;
//            return true;
//        }
//        if(i==0){
//            if(arr[i]==k){
//                dp[i][k]=1;
//                return true;
//            }
//            dp[i][k]=2;
//            return false;
//        }
//
//        if(dp[i][k] != 0){
//            return (dp[i][k]==1);
//        }
//
//        boolean pick = false;
//        if(arr[i]<=k){
//            pick = recur(arr, i-1, k-arr[i], dp);
//        }
//        boolean nopick = recur(arr, i-1, k, dp);
//
//        boolean ans = pick || nopick;
//        if(ans){
//            dp[i][k]=1;
//        }else{
//            dp[i][k]=2;
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String ip = sc.nextLine();
//        int k = sc.nextInt();
//        ip = ip.replaceAll("\\[|\\]|\\s+","");
//        String[] parts = ip.split(",");
//        int[] arr = new int[parts.length];
//
//        int p=0;
//        for(String x : parts){
//            arr[p++] = Integer.parseInt(x);
//        }
//        int n = arr.length;
//        int[][] dp = new int[n][k+1];
//
//        if(recur(arr,arr.length-1, k, dp)){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }
//    }
//}
