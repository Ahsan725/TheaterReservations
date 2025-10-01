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
        String moreThanOne = "ticket"; //this variable will be used for ticket(s) conditional formatting

        //creating a scanner obj
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the theater reservation system: May I have your name please?");
        var fullName = sc.nextLine();
        var names = fullName.split("\\s");
        //name split into first and last
        first = names[0];
        last = names[1];

        //getting the date
        System.out.println("What date would you like to reserve tickets for?");
        date = sc.nextLine();

        //get the number of tickets
        System.out.println("How many tickets will you need?");
        tickets = sc.nextInt();
        //if the ticket is more than one we change the moreThanOne variable to use 's'. There are many ways to do this
        // I just think this was the mot explicit way to do it.
        if (tickets > 1){
            moreThanOne = "tickets";
        }

        //print results
        System.out.println(tickets + " " + moreThanOne + " reserved for " + date + " under " + last + ", " + first);

    }
}
