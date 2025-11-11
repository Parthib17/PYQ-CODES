package YEAR_2025.DATE_18_04_2025.Shift_1;

import java.util.*;
public class CommonHeightDifference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week1 = sc.nextInt();
        int week2 = sc.nextInt();
        int week3 = sc.nextInt();
        int week4 = sc.nextInt();

        if (week1<0 || week2<0 || week3<0 || week4<0){
            System.out.println("Not valid inputs");
        } else{
            int dif1=week2-week1;
            int dif2=week3-week2;
            int dif3=week4-week3;

            if(dif1 == dif2 || dif1 == dif3){
                System.out.println(String.valueOf(dif1));
            } else if(dif2 == dif3){
                System.out.println(String.valueOf(dif2));
            } else {
                System.out.println("None");
            }
        }
    }
}