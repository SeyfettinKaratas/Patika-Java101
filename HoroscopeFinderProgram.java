package com.company;
import java.util.Scanner;

public class HoroscopeFinderProgram {
    public static void main(String[] args) {
        int month, day;

        Scanner input =new Scanner(System.in);
        System.out.print("Enter your birth month : ");
        month=input.nextInt();
        System.out.print("Enter your birth day : ");
        day=input.nextInt();
        boolean isError=false;
        String burc="";

    if (month == 1 && day <= 31 && day >= 1) {
        if (day < 22) {
            burc = "Oğlak";
        } else {
            burc = "Kova";
        }
    } else if (day >= 1 && day <= 28 && month == 2) {
        if (day < 20) {
            burc = "Kova";
        } else {
            burc = "Balık";
        }
    } else if (day >= 1 && day <= 31 && month == 3) {
        if (day < 21) {
            burc = "Balık";
        } else {
            burc = "Koç";
        }
    } else if (day >= 1 && day <= 30 && month == 4) {
        if (day < 21) {
            burc = "Koç";
        } else {
            burc = "Boğa";
        }
    } else if (day >= 1 && day <= 31 && month == 5) {
        if (day < 22) {
            burc = "Boğa";
        } else {
            burc = "İkizler";
        }
    } else if (day >= 1 && day <= 30 && month == 6) {
        if (day < 23) {
            burc = "İkizler";
        } else {
            burc = "Yengeç";
        }

    } else if (day >= 1 && day <= 31 && month == 7) {
        if (day < 23) {
            burc = "Yengeç";
        } else {
            burc = "Aslan";
        }
    } else if (day >= 1 && day <= 31 && month == 8) {
        if (day < 23) {
            burc = "Aslan";
        } else {
            burc = "Başak";
        }
    } else if (day >= 1 && day <= 30 && month == 9) {
        if (day < 23) {
            burc = "Başak";
        } else {
            burc = "Terazi";
        }
    } else if (day >= 1 && day <= 31 && month == 10) {
        if (day < 23) {
            burc = "Terazi";
        } else {
            burc = "Akrep";
        }
    } else if (day >= 1 && day <= 30 && month == 11) {
        if (day < 22) {
            burc = "Akrep";
        } else {
            burc = "Yay";
        }
    } else if (day >= 1 && day <= 31 && month == 12) {
        if (day < 22) {
            burc = "Yay";
        } else {
            burc = "Oğlak";
        }
    } else {
        isError = true;
    }

    if (isError == true) {
        System.out.println("Hatalı giriş yaptınız!!");
    } else {
        System.out.println("Burcunuz : " + burc);
    }


    }
}
