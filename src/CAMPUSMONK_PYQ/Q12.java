package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        int k = sc.nextInt();
        String[] days = {"mon","tue","wed","thu","fri","sat","sun"};
        int start_index=-1;
        for(int i=0;i<days.length;i++){
            if(days[i].equals(day)){
                start_index=i;
                break;
            }
        }

        int c=0;
        for(int i=0;i<=k;i++){
            if((start_index+i) % 7 == 6){
                c++;
            }
        }

        System.out.println(c);
    }
}
