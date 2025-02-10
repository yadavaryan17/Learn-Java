//Find largest number into the array.
public class FindLarge {

    public static void FindLargestNo(int num[]){
        int large = 0;
        for(int i = 0; i < num.length - 1; i++){
            if(num[large] < num[i + 1]){
                large = i + 1;
            }
        }
        System.out.println("Largest no. is "+num[large]+" and index is "+large);
    }
    public static void FindLargest_No(int num[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < num.length ; i++){
            if(large < num[i]){
                large = num[i];
            }
        }
        System.out.println("Largest no. is "+large);
    }

    public static void main(String str[]){
        int num[] = {3, 5, 2, 6 ,9 , 1 ,8};
        FindLargest_No(num);
    } 
}
