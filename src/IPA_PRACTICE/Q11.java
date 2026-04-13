package IPA_PRACTICE;

public class Q11 {
    public static void main(String[] args) {
        int n = 10;
        int c = 0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                c++;
            }
        }
        System.out.println(c);
    }

    public static int findNthPrime(int n){
        int c = 0;
        int num = 2;
        while(c<n){
            if(isPrime(num)){
                c++;
            }
            num++;
        }
        return num-1;
    }

    public static boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
