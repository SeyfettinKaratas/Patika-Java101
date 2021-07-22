package com.company;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0;
        int numCount=0;
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        number=input.nextInt();

        for (int i=1; i<=number; i++){
            if(i%12==0){
                
                sum+=i;
                numCount+=1;
                System.out.println(sum/numCount);
            }
        }
    }
}
