package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen değer giriniz : ");
        n1=input.nextInt();
        System.out.println("Lütfen değer giriniz : ");
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen işlem seçiniz : ");

        select=input.nextInt();
        switch (select) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("yanlış seçim yaptınız!!");
        }


    }
}
