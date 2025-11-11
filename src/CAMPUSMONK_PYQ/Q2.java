package CAMPUSMONK_PYQ;

import java.util.*;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        input = input.replaceAll("\\[|\\]|\\s","");

        String[] parts = input.split(",");

        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }

        int c=1;
        int maxSoFar = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxSoFar){
                c++;
                maxSoFar=arr[i];
            }
        }

        System.out.println(c);
    }
}
