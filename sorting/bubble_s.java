// Program for sorting array by BubbleSort.
public class bubble_s {

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
           }
        }

    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tra = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tra;
                }
            }
        }
        printArr(arr);
    }

    public static void main(String str[]){
        int arr[] = {7,8,3,1,2};
        bubbleSort(arr);
    }
}
