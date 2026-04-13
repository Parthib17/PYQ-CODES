package IPA_PRACTICE;

public class Q13 {
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
        int a=4;
        int b=6;

        int lcm = (a*b)/gcd(a,b);

        System.out.println(lcm);
    }
}
