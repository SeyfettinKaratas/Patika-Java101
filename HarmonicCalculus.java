package com.company;

import java.util.Scanner;

public class HarmonicCalculus {
    public static void main(String[] args) {
        double n;
        double result=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter n : ");
        n=input.nextInt();

        while(n>0){
            result+=(1/n);
            n--;
        }
        System.out.println(result);
    }
}
