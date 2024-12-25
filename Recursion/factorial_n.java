import java.util.*;
public class factorial_n {
    public static int printFac(int n){
        if(n == 1 || n == 0){
            return 1;
        }
      int fac = printFac(n-1);
      
      return fac*n;
    }
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fac_ no.  ");
        int n = sc.nextInt();     
        System.out.println(printFac(n));

    }
    
}
