import java.util.*;
public class ButAndSellStock {

    public static int BuyAndSellStocks(int arr[]){
        int BuyStock = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i = 0; i < arr.length; i++){
            if(BuyStock < arr[i]){
                int profit = arr[i] - BuyStock;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                BuyStock = arr[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String str[]){
        int arr[] = {1 , 7 , 5 , 3 , 6 , 4};
        System.out.println(BuyAndSellStocks(arr));

    }
}
