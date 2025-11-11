package CAMPUSMONK_PYQ;

import java.util.*;

public class Q13 {
    public static int longestSeq(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }

        int max_length = 0;

        for(int x:arr){
            if(!set.contains(x-1)){
                int curr_length = 1;
                int num = x;

                while(set.contains(num+1)){
                    num = num+1;
                    curr_length++;
                }

                max_length = Math.max(curr_length, max_length);
            }
        }
        return max_length;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(longestSeq(arr));
    }
}
