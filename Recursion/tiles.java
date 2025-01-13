public class tiles {
    public static int printTilt(int n,int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = printTilt(n-m, m);

        int horizontal = printTilt(n-1, m);
        return vertical+horizontal;
    }
    public static void main(String arg[]){
        System.out.println(printTilt(4, 2));
    }
    
}
