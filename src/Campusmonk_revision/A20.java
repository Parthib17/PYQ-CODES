package Campusmonk_revision;

import java.util.*;

public class A20{
    static void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int k = 0;
        for(String x : parts){
            arr[k++] = Integer.parseInt(x);
        }
        reverse(arr);
    }
}
