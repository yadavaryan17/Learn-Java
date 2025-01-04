public class sorting {
    public static boolean isSorting(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
            return isSorting(arr, idx+1);
    }
    public static void main(String str[]){
        int arr[] = {1,2,3,4};
        
        System.out.println(isSorting(arr, 0));
    }
}
