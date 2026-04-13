package IPA_PRACTICE;

public class Q8 {
    public static void main(String[] args) {
        int n = 153;
        int len = String.valueOf(n).length();
        int s = 0;
        int t = n;
        while(n>0){
            int d = n%10;
            s+= (int) Math.pow(d,len);
            n=n/10;
        }
        boolean res = (t == n) ? true : false;
        System.out.println(res);
    }
}
