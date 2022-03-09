package aldidi;

import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float alas, tinggi;
        double luas;

        System.out.println("masukan alas :");
        alas=input.nextFloat();
        System.out.println("masukan tinggi :");
        tinggi=input.nextFloat();
        luas=0.5*alas*tinggi;
        System.out.println("Luas segitiga "+luas);
    }
}
