package IPA_PRACTICE;

public class Q7 {
    public static int recurFact(int n){
        if(n<=1){
            return n;
        }

        return n * recurFact(n-1);
    }

    public static int iterFact(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(recurFact(n)+" :: "+iterFact(n));
    }
}
