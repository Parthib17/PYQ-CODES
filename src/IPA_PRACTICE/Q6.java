package IPA_PRACTICE;

import java.util.*;


public class Q6 {
    public static void main(String[] args) {
        int n = 8;
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                arr.add(i);
                if(n/i != i){
                    arr.add(n/i);
                }
            }
        }

        Collections.sort(arr);
        System.out.println(arr);
    }
}
