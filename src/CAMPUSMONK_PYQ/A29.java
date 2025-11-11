package CAMPUSMONK_PYQ;

import java.util.Arrays;
import java.util.Scanner;

public class A29 {
    public static void moveZeros(int[] arr){
        int[] temp = new int[arr.length];
        int c=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
                c++;
            else
                temp[j++] = arr[i];
        }
        for(int k=j;k<=c;k++){
            temp[j]=0;
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);

    }
}