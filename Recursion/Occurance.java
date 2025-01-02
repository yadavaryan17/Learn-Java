// Find first and last Occurance of an element in string 
public class Occurance {
    public static void findOccurance(String str,int idx,int first,int last){
        if(idx == str.length()){
            System.out.println("first occur : "+first+"\nLast occur : "+last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'a'){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }             
        }
        findOccurance(str, idx+1, first, last);
        

    }

    public static void main(String Str[]){
        String str = "accdfaabcsanb";
        findOccurance(str, 0, 0, 0);
    }
}