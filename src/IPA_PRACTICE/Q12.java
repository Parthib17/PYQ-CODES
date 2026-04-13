package IPA_PRACTICE;

public class Q12 {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static int gcdIter(int a, int b){
        while(b!=0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=9;
        int b=8;

        System.out.println(gcd(a,b)+" :: "+gcdIter(a,b));
    }
}
