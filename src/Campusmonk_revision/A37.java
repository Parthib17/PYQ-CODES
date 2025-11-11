package Campusmonk_revision;
import java.util.*;
public class A37 {
    public static int pascalValue(int r,int c){
        int res = 1;
        for(int i=0;i<c;i++){
            res = res * (r-i);
            res = res / (i+1);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(pascalValue(r-1,c-1));

    }
}
