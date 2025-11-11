package Recursion;

public class TowerOfHanoi {
    static int c=0;
    public static void toh(int n,String src,String helper,String des){
        c++;
        if(n==1){
            return;
        }
        toh(n-1,src,des,helper);
        toh(n-1,helper,src,des);

    }
    public static void main(String[] args) {
        toh(4,"A","B","C");
        System.out.println(c);
    }
}
