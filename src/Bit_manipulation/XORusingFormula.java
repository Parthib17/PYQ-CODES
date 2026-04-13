package Bit_manipulation;

public class XORusingFormula {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int res  = (a & ~b) | (~a & b);
        System.out.println(res);
    }
}
