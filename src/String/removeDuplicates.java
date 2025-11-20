package String;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1) == c){
                sb.deleteCharAt(sb.length()-1);
            } else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
