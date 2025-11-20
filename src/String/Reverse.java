package String;
import java.util.*;

public class Reverse {
    public static String reverse(String s){
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();

        while(i<j){
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }

        String res = "";
        for(char c : arr){
            res+=c;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "PaRtHiB";
        System.out.println(reverse(s));
    }
}
