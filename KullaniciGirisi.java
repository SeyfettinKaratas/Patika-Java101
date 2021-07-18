package com.company;
import  java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        userName=input.nextLine();
        System.out.print("Şifre : ");
        password=input.nextLine();

        if (userName.equals("Java101") && password.equals("java1234")){
            System.out.println("Bilgileriniz doğru, giriş yapılıyor...");
        }
        else {
            System.out.println("Kullanıcı adı veya şifre hatalı! \n 1-Tekrar deneyiniz \n 2-Şifrenizi mi unuttunuz?");

            int answer =input.nextInt();

            switch (answer){
                case 1:

                    Scanner inp=new Scanner(System.in);
                    System.out.print("Kullanıcı adı : ");
                    userName=inp.nextLine();
                    System.out.print("Şifre : ");
                    password=inp.nextLine();

                    if (userName.equals("Java101") && password.equals("java1234")){
                        System.out.println("Bilgileriniz doğru, giriş yapılıyor...");
                    }
                    else {
                    System.out.println("Kullanıcı giriş sayfasına gidiniz!");}

                    break;
                case 2:
                    String newPassword;
                    Scanner newP=new Scanner(System.in);
                    System.out.print("lütfen yeni şifre giriniz : ");
                    newPassword=newP.nextLine();
                    if (newPassword.equals("java1234")){
                        System.out.println("Eski şifre ile yeni şifre aynı olmamalı!");
                    }
                    else{
                        System.out.println("Yeni şifre başarı ile oluşturuldu.Şimdi giriş yapınız!");
                        Scanner in=new Scanner(System.in);
                        System.out.print("Kullanıcı adı : ");
                        userName=in.nextLine();
                        System.out.print("Şifre : ");
                        password=in.nextLine();

                        if (userName.equals("Java101") && password.equals("java1234")){
                            System.out.println("Bilgileriniz doğru, giriş yapılıyor...");
                        }
                        else {
                            System.out.println("Kullanıcı giriş sayfasına gidiniz!");}
                    }
                default:
                    System.out.println("Seçiminiz geçersiz!!!");
            }
        }
    }
}
