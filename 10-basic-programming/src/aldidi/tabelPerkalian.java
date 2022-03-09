package aldidi;

import java.util.Scanner;

public class tabelPerkalian{
    private static int cetakTabel(int n){

        Scanner input=new Scanner(System.in);
        int b;
        System.out.println("tabel :");
        b=input.nextInt();


        for (int i=1; i<=10; i++ ){
            for (int j=1; j<=10; j++){
                System.out.print(" "+i*j+"\t");
            }
            System.out.print("\n\n");

        }
        return b;
    }
    public static void main(String[] args){
        cetakTabel(8);
    }
}
