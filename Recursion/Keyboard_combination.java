public class Keyboard_combination {
    public static String []map = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yx"};
    public static void recursion2(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = map[curr - '0'];

        for(int i = 0; i < mapping.length(); i++){
            recursion2(str, idx+1, newString+mapping.charAt(i));
        }

    }
    public static void main(String Str[]){
        String str = "23";
        recursion2(str, 0, "");
    }
    
}
