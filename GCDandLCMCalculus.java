package com.company;

import java.util.Scanner;

public class GCDandLCMCalculus {
    public static void main(String[] args) {

        int gcd, lcm;
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Pleae enter n1 : ");
        n1 = input.nextInt();
        System.out.println("Please enter n2 : ");
        n2 = input.nextInt();

        if (n1 < n2) {
            int i = n1;
            while (i >=1) {

                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                    System.out.println(gcd);

                    lcm=(n1*n2)/gcd;
                    System.out.println(lcm);
                    break;
                }
                i--;
            }
        }else{
            int i = n2;
            while (i >=1) {

                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                    System.out.println(gcd);

                    lcm=(n1*n2)/gcd;
                    System.out.println(lcm);
                    break;
                }
                i--;
            }

        }
    }
}
