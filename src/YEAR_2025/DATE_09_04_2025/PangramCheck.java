package YEAR_2025.DATE_09_04_2025;

import java.util.Scanner;

public class PangramCheck {
    public static boolean isAlphabet(char c){
        if(c >='a' && c<='z'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str =new Scanner(System.in).nextLine();
        str = str.toLowerCase();
        int[] chars = new int[26];
        for(int i=0;i<str.length();i++){
            if(!isAlphabet(str.charAt(i))){
                continue;
            }
            int temp = (int)(str.charAt(i))-97;
            chars[temp] = 1;
        }

        int flag=0;
        for(int x:chars){
            if(x==0)
                flag=1;
        }
        if(flag==0){
            System.out.println("Yes Pangram");
        } else{
            System.out.println("Not Pangram");
        }
    }
}
