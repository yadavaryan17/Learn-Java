public class permutation {
    public static void Permutation(String str,String permu){
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }
        for(int i = 0; i<str.length();i++){
            System.out.println(i+" "+str);
            char currChar = str.charAt(i);
            String New = str.substring(0, i) + str.substring(i+1);
            Permutation(New, permu+currChar);
            System.out.println(permu);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        Permutation(str,"");
    }
    
}
