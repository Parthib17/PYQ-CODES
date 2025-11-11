package YEAR_2024.DATE_26_04_2024.Shift_1.Shift_2;

import java.util.*;

public class CubeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
//        sc.nextLine();
//        String ip = sc.nextLine();
//        ip = ip.replaceAll("\\[|\\]","").trim();
//        System.out.println(ip);
//        String[] parts = ip.split("\\s+");
//        int[] arr = new int[parts.length];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=p;i<=q;i++){
            sum+=i*i*i;
            //sum+=Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
