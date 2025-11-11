package YEAR_2024.DATE_08_05_2024.Shift_2;

import java.util.Scanner;

public class ReplaceDivisibles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Process each element
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print("ThreeFive");
            } else if (arr[i] % 3 == 0) {
                System.out.print("Three");
            } else if (arr[i] % 5 == 0) {
                System.out.print("Five");
            } else {
                System.out.print(arr[i]);
            }

            if(i<n-1){
                System.out.print(" ");
            }
        }
    }
}
