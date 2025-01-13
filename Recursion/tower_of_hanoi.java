public class tower_of_hanoi {
    public static void printhoni(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            System.out.println("hellow");
            return;
        }
        printhoni(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        printhoni(n-1, helper, src, dest);


    }
    public static void main(String str[]){
        int n = 4;
        printhoni(n, "S", "H", "D");
    }   
}
