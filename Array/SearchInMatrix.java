// Search in a row wise and column wise sorted matrix
public class SearchInMatrix {
    public static boolean SearchKey(int nums[][] , int key){
        int row = 0; 
        int col = nums[0].length-1;
        while(row <= nums.length && col >= 0){
            if(nums[row][col] == key){
                System.out.println(row +" ,"+col);
                return true;
            }
            else if(nums[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void main(String str[]){
        int nums[][] = {
            {10 , 20 , 30 , 40},
            {15 , 25 , 35 , 45},
            {27 , 29 , 37 , 48},
            {32 , 33 , 39 , 50},
        };
        int key = 50;
        SearchKey(nums , key);
    }
}