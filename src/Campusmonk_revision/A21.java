package Campusmonk_revision;
import java.util.*;

public class A21{

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
        int max = Integer.MIN_VALUE;
        int elem = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                elem = entry.getKey();
            }
            else if(entry.getValue() == max && entry.getKey()<elem){
                elem = entry.getKey();
            }
        }
        System.out.println(elem);
    }
}
