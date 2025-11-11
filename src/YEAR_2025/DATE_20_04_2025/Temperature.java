package YEAR_2025.DATE_20_04_2025;

import java.util.*;

public class Temperature{
    public static String checkTemp(int temp){
        if(temp<10)
            return "it's very cool";
        else if(temp<=20)
            return "it's cold";
        else
            return "it's warm";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double avg = (a+b)/2.0;

        System.out.println(checkTemp(a)+", "+checkTemp(b));
        System.out.printf("%.1f",avg);
        System.out.println();
        System.out.println(b+" "+a);

    }
}