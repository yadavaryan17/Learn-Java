public class StringComperassion {

    public static void compressString(String s){
    // StringBuilder sb = new StringBuilder();
    String str = "";
    int count = 1;
    for(int i = 0; i < s.length(); i++){
        if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
            count++;
        }
        else{
            // sb.append(s.charAt(i));
            str += s.charAt(i);
            if(count > 1){

                // sb.append(count);
                str += count;
            }
            count = 1;
        }
    }
    System.out.println(str);
    // System.out.println(sb.toString());
    }
    public static void main(String []args){
        String s = "abcd";
        compressString(s);
    }
}
