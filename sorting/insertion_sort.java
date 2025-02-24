// Program for sorting array by insertionSort.

public class insertion_sort {
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }

    public static void main(String str[]){
        int arr[] = {7 ,8 ,3 ,1 ,2};   
        insertionSort(arr);
    }
}
