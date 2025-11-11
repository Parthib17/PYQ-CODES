package Campusmonk_revision;

import java.util.*;

public class A19{
    public static String isSorted(int[] arr){
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                c++;
            }
        }
        if(arr[arr.length-1] > arr[0]){
            c++;
        }
        if(c<=1){
            return "True";
        }
        return "False";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];

        int i = 0;
        for(String x : parts){
            arr[i++] = Integer.parseInt(x);
        }

        System.out.println(Arrays.toString(parts));

        System.out.println(isSorted(arr));
    }
}

