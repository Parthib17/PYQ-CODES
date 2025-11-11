package YEAR_2024.DATE_29_04_2024.Shift_1;

import java.util.Scanner;

public class MaxInSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        int k = sc.nextInt();
        char[] str = ip.toCharArray();
        int[] arr = new int[str.length];
        int p=0;
        for(char c: str){
            arr[p++]=c-'0';
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=arr.length-k;i++){
            int max = arr[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(arr[j],max);
            }
            sb.append(max);
        }

        System.out.println(sb.toString());

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String[] parts = s.split("");
//        int[] arr = new int[parts.length];
//
//        for(int i=0;i<arr.length;i++){
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//
//        int k = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0;i<=arr.length-k;i++){
//            int max = arr[i];
//            for(int j=i;j<i+k;j++){
//                max = Math.max(max,arr[j]);
//            }
//            sb.append(max);
//        }
//
//        System.out.println(sb.toString());
    }
}
