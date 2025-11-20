package String;
import java.util.*;

public class Palindrome {
    public static String reverse(List<String> list){
        int i=0;
        int j=list.size()-1;

        while(i<j){
            String c = list.get(i);
            list.set(i,list.get(j));
            list.set(j,c);
            i++;
            j--;
        }

        String f = "";
        for(String s1 : list){
            f+=" "+s1;
        }
        return f;
    }
    public static void main(String[] args) {
        String s = "The sky is blue";
        String[] parts = s.split("\\s+");
        String str = "";
        List<String> list = new ArrayList<>();
        for(String x : parts){
            list.add(x);
        }

        System.out.println(reverse(list).trim());
    }
}
