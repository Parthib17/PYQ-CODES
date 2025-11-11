package CAMPUSMONK_PYQ;

import java.util.*;

public class Q6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of monkeys
        int m = sc.nextInt();  // bananas
        int p = sc.nextInt();  // peanuts
        int k = sc.nextInt();  // bananas per monkey
        int j = sc.nextInt();  // peanuts per monkey

        // how many monkeys can eat bananas
        int bananaMonkeys = m / k;

        // how many monkeys can eat peanuts
        int peanutMonkeys = p / j;

        int monkeysEat = bananaMonkeys + peanutMonkeys;

        if(monkeysEat > n) {
            monkeysEat = n;
        }
        
        int monkeysLeft = n - monkeysEat;

        System.out.println(monkeysLeft);
    }
}
