package YEAR_2025.DATE_18_04_2025.Shift_2;

import java.util.*;
public class MatrixPrintBasedOnEvenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<m;i++){
            if(i%2 == 0){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]);
                    if(j<n-1){
                        System.out.print(" ");
                    }
                }
            } else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(matrix[i][j]);
                    if(j>0){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
