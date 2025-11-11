package YEAR_2024.DATE_08_05_2024.Shift_1;

import java.util.Scanner;

public class PasswordGenerator {
    public static boolean isValid(String pass){
        if(pass.length()<8)
            return false;

        boolean hasDigit = false, hasSpecial = false, hasUpper = false, hasLower= false;

        for(char c : pass.toCharArray()){
            if(Character.isDigit(c))
                hasDigit=true;
            if(Character.isUpperCase(c))
                hasUpper=true;
            if(Character.isLowerCase(c))
                hasLower=true;
            if(c=='@' || c=='#')
                hasSpecial=true;
        }
        return hasDigit && hasSpecial && hasUpper && hasLower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        int k = sc.nextInt();

        if(!isValid(pass)){
            System.out.println("Incorrect Password format.");
        }

        StringBuilder sb = new StringBuilder();
        for (char c : pass.toCharArray()){
            if(c=='@'){
                sb.append('#');
            }
            else if(c=='#'){
                sb.append('@');
            }
            else {
                char ch = (char) (c+k);
                sb.append(ch);
            }

        }

        System.out.println(sb.toString());

    }
}
