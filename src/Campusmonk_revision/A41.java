package Campusmonk_revision;

import java.util.*;

public class A41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int j=0;
        for(String x : parts){
            arr[j++] = Integer.parseInt(x);
        }

        int c0=0,c1=0,c2=0;

        for(int x : arr){
            if(x==0){
                c0++;
            } else if(x==1){
                c1++;
            } else if(x==2){
                c2++;
            }
        }

        for(int i=0;i<c0;i++){
            arr[i] = 0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i] = 1;
        }
        for(int i=c0+c1;i<c0+c1+c2;i++){
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
