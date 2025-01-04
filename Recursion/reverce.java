public class reverce {
    public static void reverse(String a,int idx){
        char idxs = a.charAt(idx); 
        if(idx == 0){
            System.out.println(idxs);
            return;
        }
        System.out.println(idxs);
        reverse(a, idx-1);
    }
    public static void main(String str[]){
        String a = "abcd";
        reverse(a, a.length()-1);

    }
    
}
