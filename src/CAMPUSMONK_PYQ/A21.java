package CAMPUSMONK_PYQ;

import java.util.Scanner;
import java.util.*;

public class A21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[4, 4,5,5 , 6 ]";
        ip = ip.replaceAll("\\[|\\]|\\s","");
        String[] parts = ip.split(",");

        int[] arr = new int[parts.length];

        int k=0;
        for(String x : parts){
            arr[k++] = Integer.parseInt(x);
        }

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max)
                max = entry.getKey();
        }

        System.out.println(max);

    }
}
