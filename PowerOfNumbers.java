package com.company;

import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        n=input.nextInt();
        for(int i=1; i*4<=n; i*=4){
            System.out.println(4*i);
        }

        for(int i=1; i*5<=n; i*=5){
            System.out.println(5*i);
        }
    }
}
