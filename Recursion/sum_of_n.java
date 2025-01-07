import java.util.Scanner;
public class sum_of_n {
    public static void print(int n,int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        print(n-1, sum+n);
    };
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        print(sc.nextInt(), 0);
    }
    
}
