package YEAR_2024.DATE_03_05_2024.Shift_2;

import java.util.Arrays;

public class MaxEfficiencyOf3 {
    public static void main(String[] args) {
        int[] arr = {3,-2,-8,4,1};
        Arrays.sort(arr);
        int n = arr.length;
        int max =  Math.max( (arr[n-1]*arr[n-2]*arr[n-3]),
                (arr[0]*arr[1]*arr[n-1]) );
        System.out.println(max);
    }
}
