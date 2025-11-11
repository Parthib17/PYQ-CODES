package YEAR_2025.DATE_20_04_2025;

import java.util.Scanner;

public class MinimumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m<=0 || n<=0){
            System.out.println("invalid input");
        }
        else{
            int[][] matrix = new int[m][n];
            int min = Integer.MAX_VALUE;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j] = sc.nextInt();
                    if(matrix[i][j]<min){
                        min = matrix[i][j];
                    }
                }
            }
            System.out.println(min);
        }
    }
}

//Second minimummmm
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] matrix = new int[m][n];
//        if(m<0 || n<0){
//            System.out.println("Invalid Input");
//        } else{
//            int min = Integer.MAX_VALUE;
//            int sndMin = Integer.MAX_VALUE;
//            for(int i=0;i<m;i++){
//                for(int j=0;j<n;j++){
//                    matrix[i][j] = sc.nextInt();
//                    if(matrix[i][j] < min){
//                        sndMin = min;
//                        min = matrix[i][j];
//                    }
//
//                    if(matrix[i][j]<sndMin && matrix[i][j]>min){
//                        sndMin = matrix[i][j];
//                    }
//                }
//            }
//            System.out.println(sndMin);
//        }
//
//
//    }
//}
