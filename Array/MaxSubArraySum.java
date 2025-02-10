//Print Largest SubArrays Sum (Brutal Algo) 1.

public class MaxSubArraySum{

    public static void PrintMaxSubArraySum(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                    System.out.print(arr[k]+ ", ");
                }
                System.out.print(") ");

                if(max<sum){
                    max = sum;
                }
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Max SubArray : "+ max);
    }



    public static void main(String[] args) {
        int arr[] = {1 , -2 , 4 , -1 , 6};
        PrintMaxSubArraySum(arr);
    }
}