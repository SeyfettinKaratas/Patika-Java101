package com.company;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a year : ");
        year=input.nextInt();
        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0 ){

                System.out.println("It is a leap year.");
            }
            else {
                System.out.println("It is not a leap year.");
            }
        }
    }

