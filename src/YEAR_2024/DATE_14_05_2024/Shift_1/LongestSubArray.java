package YEAR_2024.DATE_14_05_2024.Shift_1;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArray {

    public static int longSum(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int s=0;
        int max =0;
        for (int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s==k){
                max=Math.max(max,i+1);
            }
            int rem = k-s;
            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                max = Math.max(len,max);
            }
            if(!map.containsKey(s)){
                map.put(s,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(longSum(arr,k));
    }
}
