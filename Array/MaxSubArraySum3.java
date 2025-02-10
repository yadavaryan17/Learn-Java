//Print Largest SubArrays Sum (Kadane's Algo) 3.
public class MaxSubArraySum3 {
    
public static void MaxSubArraySum(int arr[]){
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum = sum + arr[i];
        if(sum < 0){
            sum = 0;
        }
        max = Math.max(max, sum);
    }
    System.out.println("Max number is : "+ max);
}

public static void main(String[] args) {
    int arr[] = {1 , -2 , 4 , -1 , 6};
    MaxSubArraySum(arr);
  }
}
