// Diagonal Sum of a Matrix
public class Diagonal {
    public static void CalDiagonalsum(int nums[][]){
        //Time Complexity : O(n^2)
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    sum += nums[i][i];
                }
                if(i + j == nums.length-1){
                    sum += nums[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void CalDiagonalSum(int nums[][]){
        //Time Complexity : O(n),  Worst Case : O(n+m)
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i][i];
            if(i != nums.length-1-i){
                sum += nums[i][nums.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String str[]){
        int nums[][] = {
            {1 , 3 , 5 },
            {5 , 6 , 7 },
            {2 , 4, 13 },
        }; 
        CalDiagonalSum(nums);
    }
}
