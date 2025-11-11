package Campusmonk_revision;

import java.util.*;

public class A34 {
    static void reverse(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;

        while(i<j){
            int t = list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];

        int p=0;
        for(String x : parts){
            arr[p++] = Integer.parseInt(x);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(arr[i]);
            }
        }

        //Collections.reverse(list);
        reverse(list);
        System.out.println(list);

    }
}
