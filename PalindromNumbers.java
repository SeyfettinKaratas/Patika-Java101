package com.company;

import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number n : ");
        n=input.nextInt();
        System.out.println(isPalindrom(n));
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }
}
