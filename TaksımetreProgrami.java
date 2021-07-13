package com.company;
import java.util.Scanner;

public class TaksımetreProgrami {
    public static void main(String[] args) {
        double km ;
        double perkm=2.20 , start=10;


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen mesafeyi km cinsinden giriniz : ");
        km=input.nextDouble();
        double price=(km*perkm)+start;

        if(price<20){
            System.out.println("Ödenecek tutar : 20 tl'dir.");
        }
        else{
            System.out.println("Ödenecek tutar : " +price+ " tl'dir.");
        }
    }
}
