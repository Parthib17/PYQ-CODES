package IPA_PRACTICE;
import java.util.*;

public class Q15 {

    public static List<List<Integer>> factor(int[] arr){
        List<List<Integer>> res = new ArrayList<>();

        for(int a : arr){
            List<Integer> temp = new ArrayList<>();
            for(int i = 2; i<=Math.sqrt(a); i++){
                while(a%i == 0){
                    temp.add(i);
                    a = a/i;
                }
            }

            if(a>1){
                temp.add(a);
            }
            res.add(temp);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(factor(arr));
    }
}
