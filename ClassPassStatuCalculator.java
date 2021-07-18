package com.company;
import java.util.Scanner;

public class ClassPassStatuCalculator {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;

        Scanner input=new Scanner(System.in);
        System.out.println("Math score : ");
        math=input.nextInt();
        System.out.println("Physics score : ");
        physics=input.nextInt();
        System.out.println("Turkish score : ");
        turkish=input.nextInt();
        System.out.println("Chemistry score : ");
        chemistry=input.nextInt();
        System.out.println("Music score : ");
        music=input.nextInt();

        if( math>=0 && physics>=0 && turkish>=0 && chemistry>=0 && music>=0 && math<=100 &&
                physics<=100 && turkish<=100 && chemistry<=100 && music<=100 ){
        int average=(math+physics+turkish+chemistry+music)/5;
             if(average>=55){
                 System.out.println("You pass the class!Congratulations");
                }
             else{
                 System.out.println("Sorry, You must take the make-up exam!");
             }
            System.out.println("Your score : "+average);
        }
        else{
            System.out.println("Enter valid score!!!");
        }

    }
}
