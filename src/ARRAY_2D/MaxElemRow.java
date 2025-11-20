package ARRAY_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxElemRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                max = Math.max(max,arr[i][j]);
            }
            list.add(max);
        }

        for(int x : list){
            System.out.println(x);
        }

//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}
