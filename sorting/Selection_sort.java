// Program for sorting array by SelectionSort.

public class Selection_sort {

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int small = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int tra = arr[i];
            arr[i] = arr[small];
            arr[small] = tra;
        }
        printArr(arr);
    }

    public static void main(String str[]){
        int arr[] = {7 ,8 ,3 ,1 ,2};
        SelectionSort(arr);
    }
}
