package Campusmonk_revision;

import java.sql.SQLOutput;
import java.util.*;

public class A33 {
    public static void intersection(int[] a, int[] b){
        HashSet<Integer> set1 = new HashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            if(set1.contains(b[i])){
                set2.add(b[i]);
            }
        }

        int[] arr = new int[set2.size()];
        int j=0;
        for(int x : set2){
            arr[j++] = x;
        }

        System.out.println(Arrays.toString(arr));
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

        String ip1 = sc.nextLine();
        ip1 = ip1.replaceAll("\\[|\\]|\\s+","");
        String[] parts1 = ip1.split(",");
        int[] arr1 = new int[parts1.length];

        int p1=0;
        for(String x : parts1){
            arr1[p1++] = Integer.parseInt(x);
        }

        intersection(arr,arr1);
    }
}
