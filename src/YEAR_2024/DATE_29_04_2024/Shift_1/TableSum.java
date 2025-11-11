package YEAR_2024.DATE_29_04_2024.Shift_1;

import java.util.Scanner;

public class TableSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            s+=(i*n);
        }
        System.out.println(s);

    }
}

