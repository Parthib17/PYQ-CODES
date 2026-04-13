package Bit_manipulation;

import java.util.Scanner;

public class TurnOffRightmostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = n & (n-1);
        System.out.println(res);

        int pos=0;
        while(((n >> pos) & 1) == 0){
            pos++;
        }

        int r = n - (1 << pos);
        System.out.println(r);

        //power of 2
        if((n & (n-1)) == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
