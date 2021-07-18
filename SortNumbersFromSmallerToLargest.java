package com.company;
import  java.util.Scanner;

public class SortNumbersFromSmallerToLargest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        a=input.nextInt();
        System.out.println("Please enter a number : ");
        b=input.nextInt();
        System.out.println("Please enter a number : ");
        c=input.nextInt();

        if(a<b && a<c){
            if(c<b){
                System.out.println("a<c<b");
            }
            else{
                System.out.println("a<b<c");
            }
        }
        if(a<b && a<c){
            if(c<b){
                System.out.println("a<c<b");
            }
            else{
                System.out.println("a<b<c");
            }
        }
        else if(b<c && b<a){
            if(c<a){
                System.out.println("b<c<a");
            }
            else{
                System.out.println("b<a<c");
            }

        }
        else{
            if(b<a){
                System.out.println("c<b<a");
            }
            else{
                System.out.println("c<a<b");
        }

    }
}
}
