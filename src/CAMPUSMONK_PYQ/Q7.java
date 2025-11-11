package CAMPUSMONK_PYQ;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isWhitespace(c) || c=='-'){
                sb.append(c);
                continue;
            }

            if(Character.isDigit(c)){
                int m = ((c-'0')+k) % 10;
                sb.append((char) (m+'0'));
            }

            if(Character.isUpperCase(c)){
                char m = (char)('A'+((c-'A')+k) % 26);
                sb.append(m);
            }

            if(Character.isLowerCase(c)){
                char m = (char)('a'+ ((c-'a')+k)%26);
                sb.append(m);
            }
        }

        System.out.println(sb.toString());
    }
}
