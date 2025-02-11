import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :  ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= n/2; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count >= 1){
            System.out.println("number is composit number");
        }
        else{
            System.out.println("number is prime number");
        }
    }
    
}
