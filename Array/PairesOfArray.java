// Create paires of arrays

public class PairesOfArray {

    public static void PrintPairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("("+arr[i]+" , "+arr[j]+")"+ "  ");
            }
            System.out.println();
        }
    }
    public static void main(String arr[]){
        int num[] = {2 , 4 , 6 , 8 , 10};
        PrintPairs(num);

    }
}
