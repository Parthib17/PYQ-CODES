package ARRAY_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckMagicSquare {
    public static boolean check(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int t = 0;
        for(int i=0;i<n;i++){
            t+=arr[0][i];
        }
        for(int i=1;i<m;i++){
            int s=0;
            for(int j=0;j<n;j++){
                s+=arr[i][j];
            }
            if(s!=t) return false;
        }
        for(int i=0;i<m;i++){
            int s=0;
            for(int j=0;j<n;j++){
                s+=arr[j][i];
            }
            if(s!=t) return false;
        }
        int d1 = 0;
        for(int i=0;i<m;i++){
            d1+=arr[i][i];
        }
        if(d1 != t) return false;

        int d2=0;
        for(int i=0;i<m;i++){
            d2+=arr[i][m-i-1];
        }
        if(d2 != t) return false;

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(check(arr));


    }
}
