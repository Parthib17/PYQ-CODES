package Recursion;

public class Temp {
    public static int xTon(int x, int n){
        if(n == 0)
            return 1;
        if(x == 0)
            return 1;
        if(n % 2 == 0)
            return xTon(x,n/2) * xTon(x,n/2);
        else
            return xTon(x,n/2) * xTon(x,n/2) * x;
    }
    public static void main(String[] args) {
        System.out.println(xTon(5,3));
    }
}
