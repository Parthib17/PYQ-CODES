//Find LCF of 2 numbers

package YEAR_2025.DATE_26_03_2025.Shift_1;

/* Online Java Compiler and Editor */
import java.util.*;

public class LCF{
    public static int gcdIterative(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }

    public static int gcdRecursive(int a,int b){
        if (b == 0)
            return a;
        return gcdRecursive(b, a%b);
    }

    public static void main(String[] args){
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){
            System.out.println(0);
        } else{
            int lcf1 = (a*b)/gcdIterative(a,b);
            int lcf2 = (a*b)/gcdRecursive(a,b);
            System.out.println(lcf1);
            System.out.println(lcf2);
        }
    }
}