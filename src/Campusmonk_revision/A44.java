package Campusmonk_revision;

import java.util.*;

public class A44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int p=0;
        for(String x : parts){
            arr[p++] = Integer.parseInt(x);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int m = n/2;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>m){
                System.out.println(entry.getKey());
            }
        }
    }
}
