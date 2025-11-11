package Campusmonk_revision;

import java.util.*;

public class A31 {

    public static int missingNum(int[] arr){
        int n = arr.length;
        int totalSum = (n*(n+1))/2;
        int s=0;
        for(int x:arr){
            s+=x;
        }
        return totalSum-s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];

        int p=0;
        for(String x : parts){
            arr[p++] = Integer.parseInt(x);
        }

        System.out.println(missingNum(arr));

    }
}
