package CAMPUSMONK_PYQ;
import java.util.*;
public class A19 {
    public static boolean isSorted(int[] arr){
        int c = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                c++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            c++;
        }

        if(c<=1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = "[3,4,5,1,2]";
        ip = ip.replaceAll("\\[|\\]|\\s","");
        String[] parts = ip.split(",");

        int[] arr = new int[parts.length];

        int i=0;
        for(String x : parts){
            arr[i++] = Integer.parseInt(x);
        }

        System.out.println(isSorted(arr));
    }
}
