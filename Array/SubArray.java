// Print SubArray
public class SubArray {

    public static void PrintSubArray(int num[]){
        for(int i = 0; i < num.length; i++){
            for(int j = i; j < num.length; j++){
                int k = i;
                System.out.print("(");
                while(k <= j){ 
                    System.out.print(" "+num[k]+" ");
                    k++;
                }
                System.out.print(")  ");
            }
            System.out.println();
        }
    }
    public static void main(String arr[]){
        int str[] = {2 ,4 ,6 ,8 ,10}; 
        PrintSubArray(str);
    }
}
