//Print Largest SubArrays Sum (Prefix Algo) 2.

public class MaxSubArraySum2 {
    public static void PrintMaxSubArraySum(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int PriFix[] = new int[arr.length];

        PriFix[0] = arr[0];
        //Create PreFix array.
        for(int i = 1; i < PriFix.length; i++){
            PriFix[i] = PriFix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = i == 0? PriFix[j] : PriFix[j] - PriFix[i - 1];
                if(max<sum){
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Max SubArray : "+ max);
    }
    public static void main(String[] args) {
        int arr[] = {1 , -2 , 4 , -2 , 7};
        PrintMaxSubArraySum(arr);
    }
}