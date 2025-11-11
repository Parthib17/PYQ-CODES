package Campusmonk_revision;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A22 {
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

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = -1;
        int sndMax = -1;
        int elem = -1;
        int sndElem=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                sndMax = max;
                sndElem = elem;
                max = entry.getValue();
                elem = entry.getKey();
            }
            if(entry.getValue()<max && entry.getValue()>sndMax){
                sndMax = entry.getValue();
                sndElem = entry.getKey();
            }
            if(entry.getValue() == sndMax && entry.getKey()<sndElem){
                sndElem = entry.getKey();
            }
        }
        System.out.println(sndElem);
    }
}
