package String;
import java.util.*;

public class RemoveAllOccOfSubstring {
    public static void main(String[] args) {
        String s ="axxxxyyyyb";
        String part = "xy";

        while(!s.isEmpty() && s.contains(part)){
            s = s.replaceFirst(part,"");
        }
        System.out.println(s);
    }
}
