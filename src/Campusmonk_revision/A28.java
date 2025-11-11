package Campusmonk_revision;

import java.util.Arrays;
import java.util.Scanner;

public class A28 {
    static void reverse(int i, int j, int[] arr){
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[1,2,3,4,5,6]";
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int k = 0;
        for(String x : parts){
            arr[k++] = Integer.parseInt(x);
        }

        int d = sc.nextInt();
        d = d % arr.length;

        reverse(0,d-1,arr);
        reverse(d,arr.length-1,arr);
        reverse(0,arr.length-1,arr);

        System.out.println(Arrays.toString(arr));
    }
}
