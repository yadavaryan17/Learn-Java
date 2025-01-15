import java.util.HashSet;

public class UniqueSubString {
    public static void uniqueSub(String str,int idx,String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }

        }
        
        char currChar = str.charAt(idx);

        uniqueSub(str, idx+1,newString+currChar,set);

        uniqueSub(str, idx+1,newString,set);
    }
    public static void main(String Str[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSub(str, 0, "",set);
    }
    
}
