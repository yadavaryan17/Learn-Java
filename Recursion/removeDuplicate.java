public class removeDuplicate {
    public static boolean map[] = new boolean[26];
    public static void revDuplicate(String Str ,int idx ,String newString){
        if(idx == Str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = Str.charAt(idx);
        if(map[currchar - 'a']){
            revDuplicate(Str, idx+1, newString);
        }
        else{
            map[currchar - 'a'] = true;
            revDuplicate(Str, idx+1, newString+currchar);
        }

        
    }
    public static void main(String str[]){
        String Str = "aabcddsryy";
        revDuplicate(Str, 0, "");

    }
    
}
