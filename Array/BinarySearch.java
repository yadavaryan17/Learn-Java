// Binary search in array
public class BinarySearch {

    public static int FindNo(int num[], int key){
        int start = 0, end = num.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }
            else if(num[mid] > key){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String str[]){
        int num[] = {1 , 3 , 5, 6 ,8 , 9 , 10};
        int key = 11;
        int result = FindNo(num, key);
        System.out.println(result);

    }
    
}
