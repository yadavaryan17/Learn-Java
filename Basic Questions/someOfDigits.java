import java.util.*;

public class someOfDigits {
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = num; i > 0; i = i/10){
            int rem = i % 10;
            sum = sum + rem;
        }
        System.out.println(sum);

    }
    
}
