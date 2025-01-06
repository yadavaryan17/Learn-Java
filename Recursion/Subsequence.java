public class Subsequence {
    public static void SubSequence(String str ,int idx ,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        SubSequence(str, idx+1, newString+currChar);

        SubSequence(str, idx+1, newString);

    }
    public static void main(String str[]){
        String Str = "123";
        SubSequence(Str, 0, "");
    }
    
}