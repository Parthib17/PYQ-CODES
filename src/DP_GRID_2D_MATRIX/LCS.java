package DP_GRID_2D_MATRIX;
import java.util.*;

public class LCS {
    public static int recur(int i, int j, String text1, String text2, int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            if (dp[i][j] == -1) {
                dp[i][j] = 1 + recur(i - 1, j - 1, text1, text2, dp);
            }
            return dp[i][j];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int case1 = recur(i - 1, j, text1, text2, dp);
        int case2 = recur(i, j - 1, text1, text2, dp);

        dp[i][j] = Math.max(case1, case2);
        return dp[i][j];
    }

    // Function to reconstruct the LCS string from dp table
    public static String buildLCS(String text1, String text2, int[][] dp) {
        int i = text1.length() - 1;
        int j = text2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 && j >= 0) {
            if (text1.charAt(i) == text2.charAt(j)) {
                sb.append(text1.charAt(i));
                i--;
                j--;
            } else {
                // Move in the direction of the larger dp value
                if (i > 0 && dp[i - 1][j] >= dp[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }

        return sb.reverse().toString(); // Because we built it backwards
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }

        int length = recur(n - 1, m - 1, text1, text2, dp);
        String lcs = buildLCS(text1, text2, dp);

        System.out.println("LCS length: " + length);
        System.out.println("LCS: " + lcs);

        return length;
    }

    // Main method to test
    public static void main(String[] args) {
        LCS sol = new LCS();

        String text1 = "abcde";
        String text2 = "ace";

        sol.longestCommonSubsequence(text1, text2);

        System.out.println();

        text1 = "AGGTAB";
        text2 = "GXTXAYB";

        sol.longestCommonSubsequence(text1, text2);
    }
}
