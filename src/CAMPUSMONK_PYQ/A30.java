package CAMPUSMONK_PYQ;

import java.util.*;


public class A30 {
    public static int removeDup(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int x : arr){
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(removeDup(arr));
    }
}