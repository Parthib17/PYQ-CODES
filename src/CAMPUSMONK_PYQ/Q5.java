package CAMPUSMONK_PYQ;

public class Q5 {
    public static void main(String[] args) {
        int t=5;
        int[] e = {7,0,5,1,3};
        int[] l = {1,2,1,3,4};

        int maxi = Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<t;i++){
           current = current + e[i] - l[i];
           maxi = Math.max(current,maxi);
        }

        System.out.println(maxi);
    }
}
