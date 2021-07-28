package com.company;

import java.util.Scanner;

public class ExcellentNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int total=0;
        System.out.println("Please enter a number : ");
        n=input.nextInt();
       for(int i=1; i<n; i++) {
           if (n %i==0){
               total+=i;
           }
       }
       if(total==n){
           System.out.println("It is a excellent number!");
       }
       else{
           System.out.println("Not a excellent number!");
       }
    }
}
