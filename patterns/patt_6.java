public class patt_6 {
    public static void main(String str[]){
        int n = 4;
        int m = 6;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" *");
            }

            for(int j = 1; j <= m-(i*2); j++){
                System.out.print("  ");
            }

                for(int j = 0; j <= i; j++){
                    System.out.print(" *");
                }
                System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" *");
            }

            for(int j = 1; j <= i*2; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= n-i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }  
}
