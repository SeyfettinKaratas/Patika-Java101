package com.company;
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
     double r, a, pi=3.14;
      Scanner input=new Scanner(System.in);
      System.out.println("Lütfen yarı çap giriniz : ");
      r=input.nextDouble();
      System.out.println("Lütfen açı giriniz : ");
      a=input.nextDouble();

      double cevre=2*pi*r*(a/360);
        System.out.println("İstenilen daire çevresi : "+cevre);
        double alan=pi*r*r*(a/360);
        System.out.println("İstenilen daire alanı : "+alan);
    }
}
