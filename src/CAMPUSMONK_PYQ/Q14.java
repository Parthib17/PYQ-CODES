package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q14 {
    public static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void findThreePalindrome(String str){
        for(int i=1;i<str.length();i++){
            String first = str.substring(0,i);
            if(!isPalindrome(first)){
                continue;
            }
            //System.out.println(first);
            String rem = str.substring(i);
            for(int j=1;j<rem.length();j++){
                String second = rem.substring(0,j);
                if(!isPalindrome(second)){
                    continue;
                }
                //System.out.println(second);

                String third = rem.substring(j);
                if(isPalindrome(third)){
                    System.out.println(first);
                    System.out.println(second);
                    System.out.println(third);
                    return;
                }
            }
        }
        System.out.println("impossible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        findThreePalindrome(input);
    }
}
