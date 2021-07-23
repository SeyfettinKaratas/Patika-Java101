package com.company;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner input=new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz : ");
            n=input.nextInt();
            if(n%2==0 && n%4==0){
               total+=n;
            }
        }while(n%2==0);
        System.out.println("Summary of enter by person even numbers : "+total);

    }
}
