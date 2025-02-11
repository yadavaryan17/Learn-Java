import java.util.*;
public class TrappedRainWater {
    public static int TrappedRainWaterr(int arr[]){
        int n = arr.length;

        // Calculate left max Boundry--
        int LeftMax[] = new int[n];
        LeftMax[0] = arr[0];
        for(int i = 1; i < n-1; i++){
            LeftMax[i] = Math.max(LeftMax[i-1], arr[i]);
        }

        // Calculate right max Boundry--
        int RightMax[] = new int[n];
        RightMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            RightMax[i] = Math.max(RightMax[i+1], arr[i]);
        }

        int TrappedWater = 0;
        for(int i = 0; i < n-1; i++){
            int WaterLevel = Math.min(LeftMax[i], RightMax[i]);
            TrappedWater += WaterLevel - arr[i];
        }
        return TrappedWater;
    }

    public static void main(String str[]){
        int arr[] = {4 , 2 , 0 , 6 , 3 , 2 , 5 };
        int result = TrappedRainWaterr(arr);
        System.out.println("Total Trapped Water : "+result);
    }
}
