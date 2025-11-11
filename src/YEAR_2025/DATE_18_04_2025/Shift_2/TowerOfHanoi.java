package YEAR_2025.DATE_18_04_2025.Shift_2;

import java.util.Scanner;

public class TowerOfHanoi {
    static int c=0;
    public static void TOF(int n, String src, String hlp, String dest){
        if(n<=0){
            return;
        }
        if(n==1){
            //System.out.println("Transfering disk "+src+" to "+dest);
            c++;
            return;
        }
        TOF(n-1,src, dest, hlp);
        //System.out.println("Transfering disk "+src+" to "+dest);
        c++;
        TOF(n-1,hlp, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOF(n, "A","B","C");
        System.out.println(TowerOfHanoi.c);

        // another approach is more easy since its asking only the nummber of steps
        int res = (int)Math.pow(2,n)-1;
        System.out.println(res);
    }
}
