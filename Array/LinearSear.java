// Linear Search in array
import java.util.*;
public class LinearSear {

    public static void LinearSearch(int num[] , int key){
        int j = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                j = i;
                break;
            }
        }
        System.out.println("you are searching for "+ num[j]+" is in "+ j +" index");
    }

    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3 , 5 , 2 , 9 , 7 , 9};
        System.out.print("Enter number you searching for : ");
        int key = sc.nextInt();
        LinearSearch(arr, key);
    }
    
}
