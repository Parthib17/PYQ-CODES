package CAMPUSMONK_PYQ;
import java.util.*;

public class A17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        ip = ip.replaceAll("\\[|\\]|\\s","");
        String[] parts = ip.split(",");

        int[] arr = new int[parts.length];

        int i=0;
        int sum = 0;
        for(String x : parts){
            arr[i++] = Integer.parseInt(x);
            if(arr[i-1]%2 != 0){
                sum++;
            }
        }

        //System.out.println(Arrays.toString(arr));
        System.out.println(sum);

    }
}
