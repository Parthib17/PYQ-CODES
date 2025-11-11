package Campusmonk_revision;
import java.util.*;

public class Test{
    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();

        while(t>0){
            int r = sc.nextInt();
            int[][] mat = new int[r][3];
            for(int i=0;i<r;i++){
                for(int j=0;j<3;j++){
                    mat[i][j] = sc.nextInt();
                }
            }

            int size = r*3;
            if(size % 2 == 0){
                res.add("pia");
            } else{
                res.add("Fiet");
            }
            t--;
        }

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
            if(i<res.size()-1){
                System.out.print(" ");
            }
        }
    }
}
