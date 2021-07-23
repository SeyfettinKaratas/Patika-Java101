package com.company;

import java.util.Scanner;

public class FactorialAndCombination {
    public static void main(String[] args) {
        int C,n,r,N,R,X;
        N=1;
        R=1;
        X=1;
        C=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number for factorial : ");
        n=input.nextInt();
        for(int i=1; i<=n; i++){
            N=N*i;
        }
        System.out.println("Factorial : " + N);

        System.out.println("Please enter a number for combination : ");
        r=input.nextInt();
        if(r<=n){
            for(int i=1; i<=r; i++){
                R=R*i;
            }
            for(int i=1; i<=(n-r); i++){
                X=X*i;
            }
            C=N/(R*X);
        }
        System.out.println("Combination result : " + C);

    }
}
