package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q11 {

    public static int maxProfit(int[] arr){
        int max=0;
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            int cost = arr[i]-min;
            max = Math.max(cost,max);
            min = Math.min(arr[i],min);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }
}
