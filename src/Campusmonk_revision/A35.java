package Campusmonk_revision;
import java.util.*;

public class A35 {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s+","");
        String[] parts = ip.split(",");
        int[] arr = new int[parts.length];
        int j=0;
        for(String x : parts){
            arr[j++] = Integer.parseInt(x);
        }
        int a=0,b=0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                res[2*a] = arr[i];
                a++;
            } else{
                res[(2*b)+1] = arr[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
