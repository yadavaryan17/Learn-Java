//Work of program is to reverse array.

public class ReverseArr {
    public static void Reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int trans = arr[i];
            arr[i] = arr[j];
            arr[j] = trans;
            i++;
            j--;
        }  
    }

    public static void main(String str[]){
        int arr[] = {2 ,3 ,4 ,5 ,6 ,7};
        Reverse(arr);
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+ " ");
        }
    }   
}
