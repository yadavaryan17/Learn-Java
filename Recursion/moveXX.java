public class moveXX {
    public static void moveX(String arr,int idx,int count,String Str){
        if(idx == arr.length()){
            for(int i = 1; i<=count; i++){
                Str += "x";
            }
            System.out.println(Str);
            return;
        }
    
        char currchar = arr.charAt(idx);
        if(currchar == 'x'){
            moveX(arr, idx+1, count+1,Str);
        }
        else{
            moveX(arr, idx+1, count, Str+currchar);
        }
    }
    public static void main(String str[]){
        String arr = "axbcxxd";
        moveX(arr, 0, 0, "");

    }
    
}
