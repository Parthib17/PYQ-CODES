package Bit_manipulation;

public class AddBitStrings {
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j>=0 || carry==1){
            int bit1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int bit2 = j >= 0 ? s2.charAt(j) - '0' : 0;

            int s = bit1+bit2+carry;

            sb.append(s % 2);
            carry = s/2;

            i--;
            j--;
        }

        int p = Integer.parseInt(s1,2);
        int q = Integer.parseInt(s2,2);

        int m = p+q;
        String res = "";

        for(int k=31;k>=0;k--){
            int bit = (m>>k) & 1;
            res+=bit;
        }

        res = res.replaceFirst("^0+","");

        if(res.isEmpty()){
            res = "0";
        }

        System.out.println(sb.reverse().toString());
        System.out.println(res);
    }
}
