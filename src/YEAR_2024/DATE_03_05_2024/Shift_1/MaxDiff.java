package YEAR_2024.DATE_03_05_2024.Shift_1;

import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] parts = ip.trim().split("\\s+");
        int[] arr = new int[parts.length];
        for(int i=0;i< parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }

        int min = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i=1;i<arr.length;i++){
            int cost = arr[i]-min;
            maxDiff = Math.max(cost,maxDiff);
            min = Math.min(min,arr[i]);
        }

        System.out.println(maxDiff);
    }
}
