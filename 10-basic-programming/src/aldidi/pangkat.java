package aldidi;

import java.util.Scanner;

public class pangkat {
    private static int exponent(int a, int b){
       int c=1;
       for (int i=1; i<=b; i++){
           c=c*a;
       }
        return c;
    }
    public static void main(String [] args){
        System.out.println(exponent(2, 3));
        System.out.println(exponent(5, 3));
    }
}


