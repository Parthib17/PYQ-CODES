package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int star=0;
        int hash=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                star++;
            } else if(s.charAt(i) == '#') {
                hash++;
            }
        }
        int res = star-hash;

        System.out.println(res);
    }
}
