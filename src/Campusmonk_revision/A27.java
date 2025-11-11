package Campusmonk_revision;

import java.util.Arrays;
import java.util.Scanner;

public class A27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[1,2,3,4,5]";
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int k = 0;
        for(String x : parts){
            arr[k++] = Integer.parseInt(x);
        }
        int f=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = f;

        System.out.println(Arrays.toString(arr));
    }
}
