package com.company;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n;
        int n1=0, n2=1;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number : ");
        n=input.nextInt();
        int total=0;
        int i=1;
        while (i<=n){
            n1=n2;
            n2=total;
            total=n1+n2;
            System.out.println(total);
            i++;
        }
    }
}
