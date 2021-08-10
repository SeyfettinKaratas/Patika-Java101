package com.company;

import java.util.Scanner;

public class RecursiveMethod {
    public static void main(String[] args) {
    Number();
    }
    static void Number(){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n=input.nextInt();
        System.out.println(n);
        int y=n;
        while(n>0){
            n-=5;
            System.out.println(n);
        }
        int x=n;
        while (x<y){
            x=n+=5;
            System.out.println(x);
        }
    }
}
