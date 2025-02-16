import java.util.*;
public class CalculatePath {
    public static void CalPath(String path){
        int y = 0 , x = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else{
                System.out.println("Invalid Path");
                return;
            }
        }
        x = x*x;
        y = y*y;
        System.out.println("Distance : " + Math.sqrt(x+y));
    }
    public static void main(String str[]){
        String path = "WWWWNNNN";
        CalPath(path);
    }
}