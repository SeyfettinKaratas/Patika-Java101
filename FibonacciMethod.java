package com.company;

import java.util.Scanner;

public class FibonacciMethod {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n=input.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {


        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}