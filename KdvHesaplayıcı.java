package com.company;
import java.util.Scanner;

public class KdvHesaplayıcı {
    public static void main(String[] args) {
        double tutar;

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen bir tutar giriniz : ");
        tutar=input.nextInt();
        if(tutar>=0  && tutar<=1000  ){
            double kdvOranı=0.18;
            double sonuc=tutar*kdvOranı;
            double toplam=sonuc+tutar;
            System.out.println("Vergi tutarı : "+sonuc);
            System.out.println("Vergili tutar : "+toplam);
        }
        else{
            double kdvOranı=0.08;
            double sonuc=tutar*kdvOranı;
            double toplam=sonuc+tutar;
            System.out.println("Vergi tutarı : "+sonuc);
            System.out.println("Vergili tutar : "+toplam);
        }


    }
}
