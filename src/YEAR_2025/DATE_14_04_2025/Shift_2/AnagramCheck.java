package YEAR_2025.DATE_14_04_2025.Shift_2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
        } else{
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            StringBuilder sb1 = new StringBuilder();
            for(char c: arr1){
                sb1.append(c);
            }

            StringBuilder sb2 = new StringBuilder();
            for(char c: arr2){
                sb2.append(c);
            }

            if(sb1.toString().equals(sb2.toString())){
                System.out.println("Anagram");
            }else {
                System.out.println("Not Anagram");
            }
        }

    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine().trim().toLowerCase().replaceAll("\\s+","");
//        String str2 = sc.nextLine().trim().toLowerCase().replaceAll("\\s+","");
//
//        char[] c1 = str1.toCharArray();
//        char[] c2 = str2.toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//        if(Arrays.equals(c1,c2)){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }
//
//    }
}
