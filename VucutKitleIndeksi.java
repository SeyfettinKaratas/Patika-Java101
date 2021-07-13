package com.company;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kg, meter;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz : ");
        kg=input.nextDouble();
        System.out.println("lütfen boyunuzu mtre cinsinden giriniz : ");
        meter=input.nextDouble();
        double index=kg/(meter*meter);
        System.out.println("Vücut kitle indeksiniz : "+ index);
    }
}
