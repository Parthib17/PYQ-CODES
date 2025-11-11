package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class A26 {
    public static int maxOnes(int[] arr){
        int max = 0;
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1)
                c++;
            else
                c=0;

            if(c>max){
                max = c;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOnes(arr));
    }
}