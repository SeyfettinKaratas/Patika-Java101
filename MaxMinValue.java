package com.company;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        int n, x;
        int max;
        int min;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter here!How many numbers will you enter : ");
        n = input.nextInt();
        if (n > 0) {
            System.out.println("Please enter a number : ");
            x = input.nextInt();
            max = x;
            min = x;
            if (n > 1) {
                for (int i = 1; i <= n - 1; i++) {
                    System.out.println("Please enter a number : ");
                    x = input.nextInt();
                    if (x > max) {
                        max = x;
                    }
                    if (x < min) {
                        min = x;
                    }
                }
            }

            System.out.println("max value : " + max);
            System.out.println("min value : " + min);
        }
        else{
            System.out.println("Please enter a valid number!");
        }
    }
}