package YEAR_2025.DATE_18_04_2025.Shift_1;

import java.util.*;

public class PermutationsOfString {

    public static void backtrack(List<List<Character>> res, ArrayList<Character> temp, char[] strArr, boolean[] used){
        if(temp.size() == strArr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<strArr.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            temp.add(strArr[i]);
            backtrack(res,temp,strArr,used);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] strArr = input.toCharArray();

        List<List<Character>> res = new ArrayList<>();

        LinkedHashSet<String> set = new LinkedHashSet<>();

        backtrack(res, new ArrayList<>(), strArr, new boolean[strArr.length]);

        for(int i=0;i<res.size();i++){
            List<Character> temp = res.get(i);
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<temp.size();j++){
                sb.append(temp.get(j));
            }
            String str = sb.toString();
            //System.out.println(str);
            set.add(str);
        }
        for(String s:set){
            System.out.println(s);
        }
        System.out.println("Total unique permutations: "+set.size());
    }

}

//
//import java.util.*;
//
//public class Main{
//    public static void backtrack(List<List<Character>> res, List<Character> temp,char[] arr,boolean[] used){
//
//        if(temp.size() == arr.length){
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(used[i] == true){
//                continue;
//            }
//            used[i] = true;
//            temp.add(arr[i]);
//            backtrack(res,temp,arr,used);
//            temp.remove(temp.size()-1);
//            used[i] = false;
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String ip = sc.nextLine();
//        char[] arr = ip.toCharArray();
//        List<List<Character>> res = new ArrayList<>();
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//
//        backtrack(res, new ArrayList<>(), arr, new boolean[arr.length]);
//
//        for(int i=0;i<res.size();i++){
//            List<Character> a = res.get(i);
//            StringBuilder sb = new StringBuilder();
//            for(int j=0;j<a.size();j++){
//                sb.append(a.get(j));
//            }
//            String str = sb.toString();
//            set.add(str);
//        }
//
//        for(String x : set){
//            System.out.println(x);
//        }
//
//        System.out.println("Total Number of Permutations: "+set.size());
//
//
//    }
//}