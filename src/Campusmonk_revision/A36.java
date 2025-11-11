package Campusmonk_revision;
import java.util.*;

public class A36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String ip = sc.nextLine();
       String[] parts = ip.split("\\s+");
       int m = Integer.parseInt(parts[0]);
       int n = Integer.parseInt(parts[1]);
       int[][] matrix = new int[m][n];
       int z=2;
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               matrix[i][j] = Integer.parseInt(parts[z]);
               z++;
           }
       }


        ArrayList<Integer> arr = new ArrayList<>();

        int left = 0, top = 0, right = n-1, bottom = m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println(arr);
    }
}
