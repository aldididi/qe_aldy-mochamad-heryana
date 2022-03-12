package com.aldidi;

import java.util.Scanner;

public class jamPasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan baris");
        int baris = scanner.nextInt();

        for (int m = 1; m <= baris; m++) {
            for (int p = m; p <= baris; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = baris - 1; m >= 1; m--) {
            for (int n = 1; n < m; n++) {
                System.out.print(" ");
            }
            for (int p = m; p <= baris; p++) {
                System.out.print("*");
            }
        }

    }
}