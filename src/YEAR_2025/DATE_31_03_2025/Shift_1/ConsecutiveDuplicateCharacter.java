package YEAR_2025.DATE_31_03_2025.Shift_1;

import java.util.Scanner;

public class ConsecutiveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip=sc.nextLine();
        if(ip.isEmpty()){
            System.out.println("");
        } else{
            char[] chars = ip.toCharArray();
            StringBuilder res = new StringBuilder();
            res.append(chars[0]);
            for(int i=1;i<chars.length;i++){
                if(chars[i] != chars[i-1]){
                    res.append(chars[i]);
                }
            }
            System.out.println(res.toString());
        }
    }
}

//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    String ip = sc.nextLine();
//    if(ip.isEmpty()){
//        System.out.println("");
//    } else{
//        char[] arr = ip.toCharArray();
//        LinkedHashSet<Character> set = new LinkedHashSet<>();
//        for(char c : arr){
//            set.add(c);
//        }
//        String res="";
//
//        for(Character c : set){
//            res+=c;
//        }
//
//        System.out.println(res);
//    }
//
//}
