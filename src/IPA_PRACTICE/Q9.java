package IPA_PRACTICE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        int n = 4;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                arr.add(i);
                if(n/i != i){
                    arr.add(n/i);
                }
            }
        }
        int s = 0;
        for(int x : arr){
            s+=x;
        }

        boolean res = s==n;
        System.out.println(res);
    }
}
