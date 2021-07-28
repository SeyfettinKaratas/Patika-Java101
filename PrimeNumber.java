package com.company;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i=2; i<100; i++){
            int number=0;
            for (int j=1; j<=i; j++){
               if( i%j==0){
                   number++;
               }
            }
            if (number==2){
                System.out.println("It is prime number : "+i);
            }
        }
    }
}
