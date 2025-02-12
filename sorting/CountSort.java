// Program for sorting array by CountSort.
import java.util.*;
public class CountSort {
    public static void CountSorting(int arr[]){
        int Large = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            Large = Math.max(Large, arr[i]);
        }
        int Count[] = new int [Large+1];
        for(int j = 0; j < arr.length; j++){
            Count[arr[j]]++;
        }
        int k = 0;
        for(int i = 0; i < Count.length; i++){
            while(Count[i] > 0){
                arr[k] = i;
                Count[i]--;
                k++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
    }
    public static void main(String str[]){
        int num[] = {7, 4 , 9 , 2 , 1 , 6 };
        CountSorting(num);
    }
}
