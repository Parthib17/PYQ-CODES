package YEAR_2024.DATE_26_04_2024.Shift_1;

import java.util.*;
public class UniquePath {
    public static int recur(int m, int n,int[][] dp){
        if(m==0 && n==0){
            dp[m][n] = 1;
            return 1;
        }

        if(m<0 || n<0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        dp[m][n] = recur(m-1,n,dp) + recur(m,n-1,dp);
        return dp[m][n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }

        int res = recur(m-1,n-1,dp);
        System.out.println(res);

    }
}


//class Solution {
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length;
//        int n = obstacleGrid[0].length;
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j] = -1;
//            }
//        }
//        return recur(m-1,n-1,dp,obstacleGrid);
//    }
//
//    public static int recur(int m, int n, int[][] dp, int[][] obstacleGrid){
//        if(m==0 && n==0){
//            if(obstacleGrid[0][0] == 1){
//                return 0;
//            }
//            dp[m][n] = 1;
//            return 1;
//        }
//
//        if(m<0 || n<0 || obstacleGrid[m][n] == 1){
//            return 0;
//        }
//        if(dp[m][n] != -1){
//            return dp[m][n];
//        }
//        dp[m][n] = recur(m-1, n, dp, obstacleGrid) + recur(m, n-1, dp, obstacleGrid);
//        return dp[m][n];
//    }
//}