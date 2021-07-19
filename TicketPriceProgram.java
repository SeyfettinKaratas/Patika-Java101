package com.company;
import java.util.Scanner;

public class TicketPriceProgram {
    public static void main(String[] args) {
        int distance, age , ticketType;
        double perKm=0.1;
        double ticketPrice;
        boolean validAge=true;
        Scanner input=new Scanner(System.in);
        while(validAge) {
        System.out.println("Enter distance : ");
        distance=input.nextInt();
        System.out.println("Enter age : ");
        age=input.nextInt();
        System.out.println("1-One direction\n2-Two direction \nEnter ticket type : ");
        ticketType=input.nextInt();

            if(age>0 && distance>0) {
                if (ticketType == 1) {

                    System.out.println("Your ticket type is one direction");
                    ticketPrice = distance * perKm;
                    if (age <= 12) {
                        ticketPrice = ticketPrice * 0.5;
                    } else if (age < 24) {
                        ticketPrice = ticketPrice * 0.9;
                    } else if (age > 65) {
                        ticketPrice = ticketPrice * 0.7;
                    }
                    System.out.println("Price : " + ticketPrice);
                    break;
                } else if (ticketType == 2) {
                    System.out.println("Your ticket type is two direction");
                    ticketPrice = distance * perKm * 0.8*2;
                    if (age <= 12) {
                        ticketPrice = ticketPrice * 0.5;
                    } else if (age < 24) {
                        ticketPrice = ticketPrice * 0.9;
                    } else if (age > 65) {
                        ticketPrice = ticketPrice * 0.7;
                    }
                    System.out.println("Price : " + ticketPrice);
                    break;
                } else {
                    System.out.println("Please enter valid value!");
                }
            }
            else{
                System.out.println("Enter valid distance or age!!!");
            }

        }


    }
}
