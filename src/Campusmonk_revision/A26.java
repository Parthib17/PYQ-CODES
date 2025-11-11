package Campusmonk_revision;

import java.util.Scanner;

public class A26 {
    static int maxOnes(int[] arr){
        int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                c++;
            } else{
                c=0;
            }
            if(c>max){
                max = c;
            }
        }
        return max;
    }

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
        System.out.println(maxOnes(arr));
    }
}
