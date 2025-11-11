package YEAR_2024.DATE_26_04_2024.Shift_1;

import java.util.*;

public class SubarraysWithGivenSum {

//    public static void solve(int[] arr, int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int s=0;
//        int c=0;
//        map.put(0,1);
//        for (int i=0;i<arr.length;i++){
//            s+=arr[i];
//            int rem = k-s;
//            if(map.containsKey(rem)){
//                c+=map.get(rem);
//            }
//            map.put(s, map.getOrDefault(s,0)+1);
//        }
//    }

    public static void solve(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                if (s == k) {
                    for (int p = i; p <= j; p++) {
                        System.out.print(arr[p] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        solve(arr,k);
    }
}
