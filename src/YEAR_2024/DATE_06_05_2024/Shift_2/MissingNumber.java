package YEAR_2024.DATE_06_05_2024.Shift_2;

import java.util.HashMap;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],1);
        }

        for(int i=0;i<=n;i++){
            if(!map.containsKey(i)){
                System.out.println(i);
            }
        }
    }
}
