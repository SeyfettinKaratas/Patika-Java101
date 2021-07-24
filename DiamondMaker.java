package com.company;

import java.util.Scanner;

public class DiamondMaker {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter n : ");
        n=input.nextInt();
     /*   while(n>=1){
            while(n-1>=0){
                System.out.print("*");
                n--;
            }
            while (((2*n)-1)>=1){
                System.out.print("*");
                n--;
            }
            System.out.println();
        }*/
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=1; x<=n; x++){
            for(int z=1; z<=x; z++){
                System.out.print(" ");
            }

            for(int y=1; y<=2*n-2*x-1; y++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
