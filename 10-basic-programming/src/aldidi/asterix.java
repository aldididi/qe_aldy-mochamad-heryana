package aldidi;

public class asterix {
    private static void playWithAsterix(int n){
       int height = n;
        for (int i=1; i<=height; i++){
            //inden
            for(int inden=1; inden<=height-1; inden++){
                System.out.print(" ");
            }

            //star
            for (int j=1; j<=i*2-1; j++ ){
              //  System.out.print("*");
            }
            System.out.print("");
        }


        //for (int i=1; i<=n; i++){
            //for (int j=1; j<=i; j++);
        //}
    }
    public static void main(String[] args){
        playWithAsterix(5);
    }
}
