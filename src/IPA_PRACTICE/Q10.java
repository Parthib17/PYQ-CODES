package IPA_PRACTICE;

public class Q10 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(findNthPrime(n));
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
