public class patt_1 {
    public static void print(int idx){
        if(idx == 0){
        return;
        }
        System.out.println(idx);
        
        print(idx-1);
        System.out.print(idx);
    } 
    public static void main(String str[]){
        int idx = 5;
        print(idx);
    }
    
}
