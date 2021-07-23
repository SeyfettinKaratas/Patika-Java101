package com.company;

import java.util.Scanner;

public class ExponentialCalculus {
    public static void main(String[] args) {
        int x, n;
        int result=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        x=input.nextInt();
        System.out.println("Please enter a number for power : ");
        n=input.nextInt();
        for(int i=1; i<=n; i++){
                result*=x;
        }
        System.out.println("Result of calculation : " + result);
    }
}
