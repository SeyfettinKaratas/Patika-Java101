package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz, kimya, turkce;

        Scanner input= new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat= input.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        fiz= input.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        kimya= input.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce= input.nextInt();

        int toplam=mat+fiz+kimya+turkce;
        double ort=toplam/4;
        System.out.println("Ders ortalaması : "+ort);
        int baraj=60;
        String sonuc = ort>=baraj ?  "Sınıfı geçtiniz" : "Sınıfta kaldınız";
        System.out.println(sonuc);

    }
}
