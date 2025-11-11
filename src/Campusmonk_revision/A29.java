package Campusmonk_revision;

import java.util.*;

public class A29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[0,0,0,1,3,-2]";
        ip = ip.replaceAll("\\[|\\]|\\s+", "");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int k = 0;
        for (String x : parts) {
            arr[k++] = Integer.parseInt(x);
        }

        int c=0;
        int j=0;
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            } else{
                temp[j++]=arr[i];
            }
        }

        for(int i=j;i<j+c;i++){
            temp[i]=0;
        }

        System.out.println(Arrays.toString(temp));
    }
}
