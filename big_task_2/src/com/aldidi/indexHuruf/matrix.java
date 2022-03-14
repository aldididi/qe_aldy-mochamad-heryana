package com.aldidi.indexHuruf;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("total row?");
        int rows = sc.nextInt();

        System.out.println("total col?");
        int cols = sc.nextInt();

        //arraynya
        int data[] [] = new int[rows][cols];
        System.out.println("masukin data matrix");

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                data[i][j] = sc.nextInt();
            }
        }

        for (int[] r : data){
            for (int x : r){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
