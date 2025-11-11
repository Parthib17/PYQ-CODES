package Campusmonk_revision;

import java.util.Scanner;

public class A25 {
    static int secondLarge(int[] arr){
        int max = -1;
        int sndMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sndMax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>sndMax){
                sndMax = arr[i];
            }
        }
        return sndMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLarge(arr));
    }
}
