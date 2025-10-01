package com.pluralsight;

import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        //output should be: 3 tickets reserved for 2023-05-13 under Johnson, Geri

        //variables
        int tickets;
        String first;
        String last;
        String date;
        String moreThanOne = "ticket";


        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the theater reservation system: May I have your name please?");
        var fullName = sc.nextLine();
        var names = fullName.split("\\s");
        first = names[0];
        last = names[1];

        System.out.println("What date would you like to reserve tickets for?");
        date = sc.nextLine();

        System.out.println("How many tickets will you need?");
        tickets = sc.nextInt();
        if (tickets > 1){
            moreThanOne = "tickets";
        }

        //print result
        System.out.println(tickets + " " + moreThanOne + " reserved for " + date + " under " + last + ", " + first);

    }
}
