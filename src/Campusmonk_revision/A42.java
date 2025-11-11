package Campusmonk_revision;
import java.util.*;

public class A42 {
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

        int max = Integer.MIN_VALUE;
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            max = Math.max(max,s);
            if(s<0){
                s=0;
            }
        }
        System.out.println(max);
    }
}
