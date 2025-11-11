package YEAR_2024.DATE_14_05_2024.Shift_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElemSum {

    public static int sumUnique(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.size()>1){
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                if(entry.getValue()==1){
                    sum+=entry.getKey();
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(sumUnique(arr));
    }
}
