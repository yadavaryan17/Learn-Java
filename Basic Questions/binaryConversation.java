import java.util.*;

//Convert Binary number to decimal number.
public class binaryConversation {

    public static void binaryToDecimal(int n){
        int dec = 0; 
        int pow = 0;
        for(int i = n; i > 0; i = i/10){
            int rem = i%10;
            dec = dec + (rem * (int)Math.pow(2, pow));
            pow++;
        }
        System.out.println(dec);
    }

    public static void decimalToBinary(int n){
        int bin = 0, pow = 0;
        for(int i = n; i > 0; i = i/2){
            int rem = i % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
        }
        System.out.println(bin);
    }

    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        binaryToDecimal(n);  
        decimalToBinary(n);
        System.out.println();

    }
}


