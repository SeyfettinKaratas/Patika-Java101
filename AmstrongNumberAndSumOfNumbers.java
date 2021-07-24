package com.company;

import java.util.Scanner;

public class AmstrongNumberAndSumOfNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = input.nextInt();

        int n=number;
        int digitNumber, digitValue;
        digitNumber=0;
        int digitPow=1;
        int totalPow=0;
        int digitTotal=0;

        while (n!=0){
            n/=10;
            digitNumber++;
        }
        n=number;
        while (n != 0) {
            digitValue = n % 10;

            digitPow=1;
            for(int i=1; i<=digitNumber; i++){
                digitPow*=digitValue;
            }
            totalPow+=digitPow;
            digitTotal+=digitValue;
            n/=10;
        }
        System.out.println(digitTotal);
    }
}

