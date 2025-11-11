package CAMPUSMONK_PYQ;

import java.util.*;

public class Practice {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Correct input order: n m p k j
        int n = sc.nextInt(); // monkeys
        int m = sc.nextInt(); // bananas
        int p = sc.nextInt(); // peanuts
        int k = sc.nextInt(); // bananas per monkey
        int j = sc.nextInt(); // peanuts per monkey

        int monkey_eat = 0;
        while(monkey_eat < n){
            if(m >= k){
                m = m - k;
                monkey_eat++;
            } else if(p >= j){
                p = p - j;
                monkey_eat++;
            } else if((m > 0 || p > 0) && (m < k && p < j)){
                monkey_eat++;
                m = 0;
                p = 0;
            } else {
                break;
            }
        }

        System.out.println(n - monkey_eat);
    }
}
