public class patt_4 {
    public static void main(String str[]){
        int count = 1;
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }
    } 
}
