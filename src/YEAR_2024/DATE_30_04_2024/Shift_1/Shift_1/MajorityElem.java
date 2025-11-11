package YEAR_2024.DATE_30_04_2024.Shift_1.Shift_1;

import java.util.*;
import java.util.Scanner;

public class MajorityElem {
    public static int majorElemOptimal(int[] arr){
        int c=0;
        int elem=0;
        for(int i=0;i<arr.length;i++){
            if(c==0){
                elem=arr[i];
                c++;
            }
            else if(arr[i] == elem)
                c++;

            else if (arr[i]!=elem)
                c--;

        }
        return elem;
    }

    public static int majorElemMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(majorElemOptimal(arr));
        System.out.println(majorElemMap(arr));

    }
}
