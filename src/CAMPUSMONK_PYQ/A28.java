package CAMPUSMONK_PYQ;

import java.util.*;

public class A28 {
    public static void leftRotate(int i, int j, int[] arr){
        while(i<=j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int d= sc.nextInt();

        d = d % arr.length;
        leftRotate(0,d-1,arr);
        leftRotate(d, arr.length-1, arr);
        leftRotate(0, arr.length-1, arr);

        System.out.println(Arrays.toString(arr));
    }
}