package com.company;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14 , elma=3.67, domates=1.11, muz=0.95, patlıcan=5.0;
        double a, e, d, m, p;
        Scanner input =new Scanner(System.in);
        System.out.println("Armut kilo giriniz : ");
        a=input.nextDouble();
        System.out.println("Elma kilo giriniz : ");
        e=input.nextDouble();
        System.out.println("Domates kilo giriniz : ");
        d=input.nextDouble();
        System.out.println("Muz kilo giriniz : ");
        m = input.nextDouble();
        System.out.println("Patlıcan kilo giriniz : ");
        p=input.nextDouble();

        double tutar=a*armut+e*elma+d*domates+m*muz+p*patlıcan;
        System.out.println("Toplam borcunuz : "+tutar);

    }
}
