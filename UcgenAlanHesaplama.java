package com.company;
import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        double a, b, c;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kenar giriniz : ");
        a=input.nextDouble();
        System.out.println("Lütfen kenar giriniz : ");
        b=input.nextDouble();
        System.out.println("Lütfen kenar giriniz : ");
        c=input.nextDouble();

        double u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı : "+ alan);

        double hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+ hipotenus);
    }
}
