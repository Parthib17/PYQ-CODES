package YEAR_2024.DATE_06_05_2024.Shift_2;

public class PrimeInRangeDigitSumPrime {
    public static boolean isPrime(int num){
        if(num<=1)
            return false;
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static int digitSum(int n){
        int s=0;
        while (n>0){
            int ld = n%10;
            s+=ld;
            n = n/10;
        }
        if(s>9){
            s=digitSum(s);
        }
        return s;
    }

    public static void main(String[] args) {
        int a=10;
        int b=50;

        for (int i=a;i<=b;i++){
            if(isPrime(i)){
                if(i>9){
                    if(isPrime(digitSum(i))){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
