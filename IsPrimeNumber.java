package com.company;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        isPrime();
    }
    static void isPrime(){
        int number;
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter a number : ");
        number=input.nextInt();
        for (int j=1; j<=number; j++){
            if( j!=number &&j!=1&&number%j==0 ){
                j++;
                System.out.println("It is  prime number : "+number);
                break;
            }
            else{
                System.out.println("It is not a prime number : "+number);
            }
        }
        if (number==2){
            System.out.println("It is prime number : "+number);
        }
    }
}
