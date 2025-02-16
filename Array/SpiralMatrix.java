// print Spiral Matrix
public class SpiralMatrix {
    public static void Spiral(int nums[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = nums.length-1;
        int EndCol = nums[0].length-1;
        while(StartRow <= EndRow && StartCol <= EndCol){
            //top print
            for(int i = StartCol; i <= EndCol; i++){
                System.out.print(nums[StartRow][i]+", ");
            }
            //Right Side
            for(int j = StartRow+1; j <= EndRow; j++){
                System.out.print(nums[j][EndCol]+", ");
            }
            //bootom side
            for(int i = EndCol-1; i >= StartCol; i--){
                if(StartRow == EndRow){
                    break;
                }
                System.out.print(nums[EndRow][i]+", ");
            }
            //Left Side
            for(int i = EndRow-1; i >= StartRow+1; i--){
                if(StartCol == EndCol){
                    break;
                }
                System.out.print(nums[i][StartCol]+", ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
    }
    public static void main(String str[]){
        int nums[][] = {
            {1 , 3 , 5 },
            {5 , 6 , 7 },
            {2 , 4, 13 },

        };
        Spiral(nums);
    }
}
