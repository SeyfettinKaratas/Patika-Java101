package com.company;

import java.util.Scanner;

public class InverseTriangular {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        n = input.nextInt();
        for (int j = 0; j < n; j++) {
            for(int k=n-j; k<n; k++){
                System.out.print(" ");
            }
            for (int i = 2 * n -2* j; i >1; i--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}