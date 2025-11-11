package Campusmonk_revision;
import java.util.*;

public class A38{
    static void rotateBrute(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        //int[][] arr = new int[m][n];
        List<List<Integer>> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            arr.add(row);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr.get(j).set(n-1-i,matrix[i][j]);
            }
        }

        System.out.println(arr);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateBrute(matrix);
    }
}
