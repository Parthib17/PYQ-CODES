package CAMPUSMONK_PYQ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[5, 5, 4, 6, 6, 7, 7, 7, 8, 8]";
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

        int sndMax = 0;
        int max = map.get(arr[0]);
        int item =-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max) {
                sndMax = max;
                item = entry.getKey();
                max = entry.getKey();
            }
            if(entry.getValue()<max && entry.getValue()>sndMax){
                sndMax = entry.getValue();
                item = entry.getKey();
            }
        }

        System.out.println(item);

    }
}
