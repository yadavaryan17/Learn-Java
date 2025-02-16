import java.util.*;
public class toUppercase {
    public static void toUpper(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(" ");
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String str[]){
        String s = "hello world";
        toUpper(s);
    }
}
