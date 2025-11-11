package YEAR_2025.DATE_09_04_2025;

import java.util.Scanner;

public class MatrixPrimeCheckInEachRow {
    public static boolean isPrime(int x){
        if (x<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] parts = ip.trim().split("\\s+");  //more than one space
        int[] arr = new int[parts.length];

        for (int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }

        //System.out.println(Arrays.toString(arr));
        int m = arr[0];
        int n = arr[1];

        if(arr.length-2 != m*n){
            System.out.println("Wrong input");
        } else{
            int[] prime = new int[m];
            int[][] matrix = new int[m][n];
            int k=2;
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    matrix[i][j] = arr[k];
                    k++;
                    if(isPrime(matrix[i][j])){
                        prime[i]=1;
                    }
                }
            }

            int flag=0;
            for(int i:prime){
                if(i==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }

//            System.out.println(Arrays.toString(matrix[0]));
//            System.out.println(Arrays.toString(matrix[1]));
        }
    }
}
