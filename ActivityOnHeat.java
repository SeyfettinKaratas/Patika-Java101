package com.company;
import java.util.Scanner;

public class ActivityOnHeat {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);

        System.out.print("Please give a weather heat value : ");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("You can ski.");
        }
        if(heat>=5 && heat<=15){
            System.out.println("You shall go to cinema.");
        }
        if(heat>=10 && heat<=25){
            System.out.println("You shall go to picnic.");
        }
        else{
            System.out.println("You can go to swimming.");
        }
    }
}
