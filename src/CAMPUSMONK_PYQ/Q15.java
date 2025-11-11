package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ip = sc.nextLine().split(" ");

        int v = Integer.parseInt(ip[0]);
        int w = Integer.parseInt(ip[1]);

        if(w%2 != 0 || w<2 || w<1 || v<1 || v>=w){
            System.out.println("Invalid input");
        } else{
            int TW = (4 * v- w) / 2;
            int FW = v - TW;
            System.out.println("TW=" + TW + " FW=" + FW);
        }
    }
}
