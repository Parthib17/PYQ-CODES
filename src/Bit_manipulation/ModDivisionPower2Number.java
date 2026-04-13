package Bit_manipulation;

import java.util.Scanner;

public class ModDivisionPower2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int res = n & (k-1);

        System.out.println(res);
    }
}
